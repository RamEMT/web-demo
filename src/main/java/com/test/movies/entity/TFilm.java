package com.test.movies.entity;


public class TFilm {

  private String id;
  private String actor;
  private String cateLogName;
  private String cateLogId;
  private double evaluation;
  private String image;
  private long isUse;
  private String locName;
  private String locId;
  private String name;
  private String onDecade;
  private String plot;
  private String resolution;
  private String status;
  private String subClassName;
  private String subClassId;
  private String typeName;
  private String typeId;
  private String updateTime;
  private long isVip;

  public TFilm() {
  }

  public TFilm(String id, String name,String image, String updateTime) {
    this.id = id;
    this.name = name;
    this.image = image;
    this.updateTime = updateTime;
  }

  public TFilm(String id, String image, String name, String onDecade, String typeName) {
    this.id = id;
    this.image = image;
    this.name = name;
    this.onDecade = onDecade;
    this.typeName = typeName;
  }

  public TFilm(String id, String actor, String cateLogName, String cateLogId, double evaluation, String image, long isUse, String locName, String locId, String name, String onDecade, String plot, String resolution, String status, String subClassName, String subClassId, String typeName, String typeId) {
    this.id = id;
    this.actor = actor;
    this.cateLogName = cateLogName;
    this.cateLogId = cateLogId;
    this.evaluation = evaluation;
    this.image = image;
    this.isUse = isUse;
    this.locName = locName;
    this.locId = locId;
    this.name = name;
    this.onDecade = onDecade;
    this.plot = plot;
    this.resolution = resolution;
    this.status = status;
    this.subClassName = subClassName;
    this.subClassId = subClassId;
    this.typeName = typeName;
    this.typeId = typeId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }


  public String getCateLogName() {
    return cateLogName;
  }

  public void setCateLogName(String cateLogName) {
    this.cateLogName = cateLogName;
  }


  public String getCateLogId() {
    return cateLogId;
  }

  public void setCateLogId(String cateLogId) {
    this.cateLogId = cateLogId;
  }


  public double getEvaluation() {
    return evaluation;
  }

  public void setEvaluation(double evaluation) {
    this.evaluation = evaluation;
  }


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public long getIsUse() {
    return isUse;
  }

  public void setIsUse(long isUse) {
    this.isUse = isUse;
  }


  public String getLocName() {
    return locName;
  }

  public void setLocName(String locName) {
    this.locName = locName;
  }


  public String getLocId() {
    return locId;
  }

  public void setLocId(String locId) {
    this.locId = locId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getOnDecade() {
    return onDecade;
  }

  public void setOnDecade(String onDecade) {
    this.onDecade = onDecade;
  }


  public String getPlot() {
    return plot;
  }

  public void setPlot(String plot) {
    this.plot = plot;
  }


  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getSubClassName() {
    return subClassName;
  }

  public void setSubClassName(String subClassName) {
    this.subClassName = subClassName;
  }


  public String getSubClassId() {
    return subClassId;
  }

  public void setSubClassId(String subClassId) {
    this.subClassId = subClassId;
  }


  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }


  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public long getIsVip() {
    return isVip;
  }

  public void setIsVip(long isVip) {
    this.isVip = isVip;
  }

}
