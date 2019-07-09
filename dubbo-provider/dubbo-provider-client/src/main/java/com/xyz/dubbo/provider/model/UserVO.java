package com.xyz.dubbo.provider.model;

import java.io.Serializable;

public class UserVO implements Serializable {
    private static final long serialVersionUID = -3778658912777092652L;
    private String userName;
    private String email;
    private String phoneNumber;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
