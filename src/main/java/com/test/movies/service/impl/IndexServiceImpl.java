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
        List<TFilm> topMovies = filmDao.selectTop("电影");
        List<TFilm> tvPlays = filmDao.selectTvPlays();
        List<TFilm> topPlays = filmDao.selectTop("电视剧");
        List<TFilm> animation = filmDao.selectAnimation();
        List<TFilm> topAnimation = filmDao.selectTop("动漫");
        return new IndexData(cateLogs,films,topMovies,tvPlays,topPlays,animation,topAnimation);
    }
}
