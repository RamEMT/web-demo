package com.test.movies.utils;

import com.test.movies.entity.TCateLog;
import com.test.movies.entity.TFilm;

import java.util.List;

public class IndexData {
    private List<TCateLog> cateLogs;
    private List<TFilm> films;
    private List<TFilm> topMovies;
    private List<TFilm> tvPlays;
    private List<TFilm> topPlays;
    private List<TFilm> animation;
    private List<TFilm> topAnimation;

    public IndexData() {
    }

    public IndexData(List<TCateLog> cateLogs, List<TFilm> films, List<TFilm> topMovies, List<TFilm> tvPlays, List<TFilm> topPlays, List<TFilm> animation, List<TFilm> topAnimation) {
        this.cateLogs = cateLogs;
        this.films = films;
        this.topMovies = topMovies;
        this.tvPlays = tvPlays;
        this.topPlays = topPlays;
        this.animation = animation;
        this.topAnimation = topAnimation;
    }

    public List<TCateLog> getCateLogs() {
        return cateLogs;
    }

    public void setCateLogs(List<TCateLog> cateLogs) {
        this.cateLogs = cateLogs;
    }

    public List<TFilm> getFilms() {
        return films;
    }

    public void setFilms(List<TFilm> films) {
        this.films = films;
    }

    public List<TFilm> getTopMovies() {
        return topMovies;
    }

    public void setTopMovies(List<TFilm> topMovies) {
        this.topMovies = topMovies;
    }

    public List<TFilm> getTvPlays() {
        return tvPlays;
    }

    public void setTvPlays(List<TFilm> tvPlays) {
        this.tvPlays = tvPlays;
    }

    public List<TFilm> getTopPlays() {
        return topPlays;
    }

    public void setTopPlays(List<TFilm> topPlays) {
        this.topPlays = topPlays;
    }

    public List<TFilm> getAnimation() {
        return animation;
    }

    public void setAnimation(List<TFilm> animation) {
        this.animation = animation;
    }

    public List<TFilm> getTopAnimation() {
        return topAnimation;
    }

    public void setTopAnimation(List<TFilm> topAnimation) {
        this.topAnimation = topAnimation;
    }
}
