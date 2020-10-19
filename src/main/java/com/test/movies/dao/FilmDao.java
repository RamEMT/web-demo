package com.test.movies.dao;

import com.test.movies.entity.TFilm;

import java.util.List;

public interface FilmDao {

    List<TFilm> selectMovies();

    List<TFilm> selectTvPlays();

    List<TFilm> selectAnimation();

    TFilm selectFilmById(String id);

    List<TFilm> selectTopMovies();
}
