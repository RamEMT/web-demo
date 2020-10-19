package com.test.movies.service.impl;

import com.test.movies.dao.FilmDao;
import com.test.movies.dao.impl.FilmDaoImpl;
import com.test.movies.entity.TFilm;
import com.test.movies.service.DetailService;

public class DetailServiceImpl implements DetailService {
    private final FilmDao filmDao = new FilmDaoImpl();

    @Override
    public TFilm getFilm(String id) {
        return filmDao.selectFilmById(id);
    }
}
