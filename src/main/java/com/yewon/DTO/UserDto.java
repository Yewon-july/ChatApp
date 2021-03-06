package com.yewon.DTO;

import java.util.Date;

public class UserDto {

    private String userId;
    private String userName;
    private String userPassword;
    private Date userJoinDate;
    private Date userLoginDate;

    public String getUserId(){
        return userId;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserPassword() {return userPassword;}

    public void setUserPassword(String userPassword) { this.userPassword = userPassword;}

    public Date getUserJoinDate() {return userJoinDate;}

    public void setUserJoinDate(Date userJoinDate) { this.userJoinDate = userJoinDate;}

    public Date getUserLoginDate() {return userLoginDate;}

    public void setUserLoginDate(Date userLoginDate) { this.userLoginDate = userLoginDate;}

}
