package com.test.movies.dao;

import com.test.movies.entity.TCateLog;

import java.util.List;

public interface CateLogDao {

    List<TCateLog> selectCateList();
}
