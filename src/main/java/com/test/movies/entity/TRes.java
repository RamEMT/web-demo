package com.test.movies.entity;


public class TRes {

  private String id;
  private long episodes;
  private long isUse;
  private String link;
  private String linkType;
  private String name;
  private String updateTime;
  private String filmId;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public long getEpisodes() {
    return episodes;
  }

  public void setEpisodes(long episodes) {
    this.episodes = episodes;
  }


  public long getIsUse() {
    return isUse;
  }

  public void setIsUse(long isUse) {
    this.isUse = isUse;
  }


  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }


  public String getLinkType() {
    return linkType;
  }

  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public String getFilmId() {
    return filmId;
  }

  public void setFilmId(String filmId) {
    this.filmId = filmId;
  }

}
