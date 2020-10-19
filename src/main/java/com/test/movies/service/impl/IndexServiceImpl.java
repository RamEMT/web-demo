package com.test.movies.service.impl;

import com.test.movies.dao.CateLogDao;
import com.test.movies.dao.FilmDao;
import com.test.movies.dao.impl.CateLogDaoImpl;
import com.test.movies.dao.impl.FilmDaoImpl;
import com.test.movies.entity.TCateLog;
import com.test.movies.entity.TFilm;
import com.test.movies.service.IndexService;
import com.test.movies.utils.IndexData;

import java.util.List;

public class IndexServiceImpl implements IndexService {
    private final CateLogDao cateLogDao = new CateLogDaoImpl();
    private final FilmDao filmDao = new FilmDaoImpl();

    @Override
    public IndexData getIndexData() {
        List<TCateLog> cateLogs = cateLogDao.selectCateList();
        List<TFilm> films = filmDao.selectMovies();
        List<TFilm> topMovies = filmDao.selectTopMovies();
        List<TFilm> tvPlays = filmDao.selectTvPlays();
        List<TFilm> animation = filmDao.selectAnimation();
        return new IndexData(cateLogs,films,topMovies,tvPlays,animation);
    }
}
