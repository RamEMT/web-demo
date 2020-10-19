package com.test.movies.entity;


public class TUser {

  private String id;
  private java.sql.Timestamp createDate;
  private java.sql.Timestamp expireDate;
  private long isVip;
  private String email;
  private String username;
  private String password;
  private long isManager;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public java.sql.Timestamp getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }


  public java.sql.Timestamp getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(java.sql.Timestamp expireDate) {
    this.expireDate = expireDate;
  }


  public long getIsVip() {
    return isVip;
  }

  public void setIsVip(long isVip) {
    this.isVip = isVip;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getIsManager() {
    return isManager;
  }

  public void setIsManager(long isManager) {
    this.isManager = isManager;
  }

}
