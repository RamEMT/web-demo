package com.test.movies.dao.impl;

import com.test.movies.dao.FilmDao;
import com.test.movies.dao.RatyDao;
import com.test.movies.entity.TFilm;
import com.test.movies.utils.DbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmDaoImpl implements FilmDao {
    RatyDao ratyDao = new RatyDaoImpl();

    @Override
    public List<TFilm> selectMovies() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        List<TFilm> list = new ArrayList<>();
        try {
            conn = DbManager.getInstance().getConn();
            ps = conn.prepareStatement("select id, image, name, on_decade ,type_name from t_film  where cate_log_name='电影' limit 0,10");
            rSet = ps.executeQuery();
            while (rSet.next()){
                String id = rSet.getString(1);
                String image = rSet.getString(2);
                String name = rSet.getString(3);
                String onDecade = rSet.getString(4);
                String typeName = rSet.getString(5);
                TFilm tFilm = new TFilm(id,image,name,onDecade,typeName);
                list.add(tFilm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbManager.closeAll(rSet,ps,conn);
        }
        return list;
    }

    @Override
    public List<TFilm> selectTvPlays() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        List<TFilm> list = new ArrayList<>();
        try {
            conn = DbManager.getInstance().getConn();
            ps = conn.prepareStatement("select id, image, name, on_decade ,type_name from t_film  where cate_log_name='电视剧' limit 0,10");
            rSet = ps.executeQuery();
            while (rSet.next()){
                String id = rSet.getString(1);
                String name = rSet.getString(3);
                String image = rSet.getString(2);
                String onDecade = rSet.getString(4);
                String typeName = rSet.getString(5);
                TFilm tFilm = new TFilm(id,image,name,onDecade,typeName);
                list.add(tFilm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbManager.closeAll(rSet,ps,conn);
        }
        return list;
    }

    @Override
    public List<TFilm> selectAnimation() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        List<TFilm> list = new ArrayList<>();
        try {
            conn = DbManager.getInstance().getConn();
            ps = conn.prepareStatement("select id, image, name, on_decade ,type_name from t_film  where cate_log_name='动漫' limit 0,10");
            rSet = ps.executeQuery();
            while (rSet.next()){
                String id = rSet.getString(1);
                String onDecade = rSet.getString(4);
                String image = rSet.getString(2);
                String name = rSet.getString(3);
                String typeName = rSet.getString(5);
                TFilm tFilm = new TFilm(id,image,name,onDecade,typeName);
                list.add(tFilm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbManager.closeAll(rSet,ps,conn);
        }
        return list;
    }

    @Override
    public TFilm selectFilmById(String id) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        TFilm film = null;
        try {
            String sql = "select id,actor,cate_log_name,cate_log_id,evaluation," +
                    "image,isUse,loc_name,loc_id,name,on_decade,plot,resolution,status" +
                    ",sub_class_name,sub_class_id,type_name,type_id from t_film where id = ?";
            conn = DbManager.getInstance().getConn();
            ps = conn.prepareStatement(sql);
            rSet = ps.executeQuery();
            if (rSet.next()){
                id = rSet.getString(1);
                String actor = rSet.getString(2);
                String cateLogName = rSet.getString(3);
                String cateLogId = rSet.getString(4);
                double evaluation = rSet.getDouble(5);
                String image = rSet.getString(6);
                int isUse = rSet.getInt(7);
                String locName = rSet.getString(8);
                String locId = rSet.getString(9);
                String name = rSet.getString(10);
                String onDecade = rSet.getString(11);
                String plot = rSet.getString(12);
                String resolution = rSet.getString(13);
                String status = rSet.getString(14);
                String subClassName = rSet.getString(15);
                String subClassId = rSet.getString(16);
                String typeName = rSet.getString(17);
                String typeId = rSet.getString(18);
                film = new TFilm(id,actor,cateLogName,cateLogId,evaluation,
                        image,isUse,locName,locId,name,onDecade,plot,resolution,
                        status,subClassName,subClassId,typeName,typeId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbManager.closeAll(rSet,ps,conn);
        }
        return film;
    }

    @Override
    public List<TFilm> selectTopMovies() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        List<TFilm> list = new ArrayList<>();
        try {
            conn = DbManager.getInstance().getConn();
            String sql = "select f.id,f.name,f.image,f.update_time from " +
                    "(select * from t_film where cate_log_name = '电影') f inner join " +
                    "(select film_id,score from t_raty) r on f.id = r.film_id order by r.score desc limit 10";
            ps = conn.prepareStatement(sql);
            rSet = ps.executeQuery();
            while (rSet.next()){
                String id = rSet.getString(1);
                String name = rSet.getString(2);
                String image = rSet.getString(3);
                String updateTime = rSet.getString(4);
                TFilm tFilm = new TFilm(id,name,image,updateTime);
                list.add(tFilm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbManager.closeAll(rSet,ps,conn);
        }
        return list;
    }
}
