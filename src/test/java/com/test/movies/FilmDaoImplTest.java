package com.test.movies;

import com.test.movies.dao.FilmDao;
import com.test.movies.dao.impl.FilmDaoImpl;
import com.test.movies.entity.TFilm;

import java.util.List;

public class FilmDaoImplTest {
    public static void main(String[] args) {
        FilmDao filmDao = new FilmDaoImpl();

        List<TFilm> films = filmDao.selectMovies();

        List<TFilm> tvPlays = filmDao.selectTvPlays();

        System.out.println(tvPlays);
    }
}
