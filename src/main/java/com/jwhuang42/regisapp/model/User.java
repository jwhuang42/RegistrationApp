package com.jwhuang42.regisapp.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator="voter_sequence")
    @SequenceGenerator(name="voter_sequence", sequenceName="voter_sequence", allocationSize=1)
    private Long id;

    @Column(name = "user_name", unique = true)
    private String userName;
    @Column(name = "user_password")
    private String userPassword;
    private String email;
    private Integer age;

    public User(String userName, String userPassword, String email, Integer age) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.email = email;
        this.age = age;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

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
}
