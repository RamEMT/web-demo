package com.test.movies.dao.impl;

import com.test.movies.dao.CateLogDao;
import com.test.movies.entity.TCateLog;
import com.test.movies.utils.DbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CateLogDaoImpl implements CateLogDao {
    @Override
    public List<TCateLog> selectCateList() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        List<TCateLog> list = new ArrayList<>();
        try {
            conn = DbManager.getInstance().getConn();
            ps = conn.prepareStatement("select id,is_use,name from t_catelog");
            rSet = ps.executeQuery();
            while (rSet.next()){
                String id = rSet.getString(1);
                int isUse = rSet.getInt(2);
                String name = rSet.getString(3);
                TCateLog tCatelog = new TCateLog(id,isUse,name);
                list.add(tCatelog);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbManager.closeAll(rSet,ps,conn);
        }
        return list;
    }
}
