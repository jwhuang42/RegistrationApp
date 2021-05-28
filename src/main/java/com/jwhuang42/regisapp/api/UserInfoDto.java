package com.jwhuang42.regisapp.api;

import javax.validation.constraints.*;

public class UserInfoDto {
    @NotBlank(message = " * UserName can not be blank")
    @Size(min = 3, max = 18, message = " * UserName needs to have a size between {min} and {max}")
    private String userName;
    @NotBlank(message = " * Password can not be blank")
    private String userPassword;
    @NotBlank(message = " * Email can not be blank")
    private String email;
    @NotNull(message = " * Age can not be blank")
    @Min(value = 18, message = " * to use our app, you need to be older than {value}")
    private Integer age;
    @AssertTrue(message = " * You have to agree to our terms first")
    private Boolean agreedToTerms;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getAgreedToTerms() {
        return agreedToTerms;
    }

    public void setAgreedToTerms(Boolean agreedToTerms) {
        this.agreedToTerms = agreedToTerms;
    }


    @Override
    public String toString() {
        return "UserInfoDto{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", agreedToTerms=" + agreedToTerms +
                '}';
    }
}
