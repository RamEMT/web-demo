package com.test.movies.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private static DbManager instance = null;
    private static DataSource ds = null;
    public static final String DB_PROPERTIES_URL = "db.properties";

    static{
        try {
            //创建druid连接池
            Properties properties = new Properties();
            properties.load(DbManager.class.getClassLoader().getResourceAsStream(DB_PROPERTIES_URL));
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public DbManager() {
    }

    public static DbManager getInstance(){
        if (instance == null){
            synchronized (DbManager.class){
                if (instance == null){
                    instance = new DbManager();
                }
            }
        }
        return instance;
    }

    /**
     * 获取连接操作
     * @return 连接对象
     */
    public Connection getConn(){
        Connection conn = null;
        try {
            conn = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 释放资源
     * @param closeables 关流
     */
    public static void closeAll(AutoCloseable...closeables){
        for (AutoCloseable c:closeables) {
            if (c != null){
                try {
                    c.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
