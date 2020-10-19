package com.test.movies.entity;


public class TVipcode {

  private String id;
  private String code;
  private String isUse;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp expireTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getIsUse() {
    return isUse;
  }

  public void setIsUse(String isUse) {
    this.isUse = isUse;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(java.sql.Timestamp expireTime) {
    this.expireTime = expireTime;
  }

}
