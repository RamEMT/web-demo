package com.test.movies.entity;


public class TRaty {

  private String id;
  private String endTime;
  private String filmId;
  private String score;

  public TRaty() {
  }

  public TRaty(String filmId, String score) {
    this.filmId = filmId;
    this.score = score;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public String getFilmId() {
    return filmId;
  }

  public void setFilmId(String filmId) {
    this.filmId = filmId;
  }


  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

}
