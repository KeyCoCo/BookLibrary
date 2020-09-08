package com.keycoco.library.pojo;


/**
 * @author Administrator
 */
public class SysUser {

  private Integer userId;
  private String userName;
  private String userPass;
  private Byte state;


  public SysUser() {
  }

  public SysUser(Integer userId, String userName, String userPass, Byte state) {
    this.userId = userId;
    this.userName = userName;
    this.userPass = userPass;
    this.state = state;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserPass() {
    return userPass;
  }

  public void setUserPass(String userPass) {
    this.userPass = userPass;
  }

  public Byte getState() {
    return state;
  }

  public void setState(Byte state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "SysUser{" +
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            ", userPass='" + userPass + '\'' +
            ", state=" + state +
            '}';
  }
}
