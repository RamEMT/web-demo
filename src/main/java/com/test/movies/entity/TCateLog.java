package com.test.movies.entity;

public class TCateLog {

  private String id;
  private long isUse;
  private String name;
  private long sort;
  private long isVip;

  public TCateLog() {
  }

  public TCateLog(String id, long isUse, String name) {
    this.id = id;
    this.isUse = isUse;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public long getIsUse() {
    return isUse;
  }

  public void setIsUse(long isUse) {
    this.isUse = isUse;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getSort() {
    return sort;
  }

  public void setSort(long sort) {
    this.sort = sort;
  }


  public long getIsVip() {
    return isVip;
  }

  public void setIsVip(long isVip) {
    this.isVip = isVip;
  }

}
