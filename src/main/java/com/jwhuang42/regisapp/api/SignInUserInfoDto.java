package com.jwhuang42.regisapp.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignInUserInfoDto {
    @NotBlank(message = " * UserName can not be blank")
    @Size(min = 3, max = 18, message = " * UserName needs to have a size between {min} and {max}")
    private String userName;
    @NotBlank(message = " * Password can not be blank")
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "SignInUserInfo{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
