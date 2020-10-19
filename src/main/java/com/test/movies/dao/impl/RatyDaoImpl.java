package com.test.movies.dao.impl;

import com.test.movies.dao.RatyDao;
import com.test.movies.entity.TRaty;
import com.test.movies.utils.DbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RatyDaoImpl implements RatyDao {
    @Override
    public List<TRaty> selectField() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        TRaty raty = null;
        ArrayList<TRaty> list = new ArrayList<>();
        try {
            conn = DbManager.getInstance().getConn();
            ps = conn.prepareStatement("select film_id,score from t_raty");
            rSet = ps.executeQuery();
            while (rSet.next()){
                String filmId = rSet.getString(1);
                String score = rSet.getString(2);
                raty = new TRaty(filmId,score);
                list.add(raty);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
