package com.jwhuang42.regisapp.controller;

import com.jwhuang42.regisapp.api.SignInUserInfoDto;
import com.jwhuang42.regisapp.api.UserInfoDto;
import com.jwhuang42.regisapp.model.User;
import com.jwhuang42.regisapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserRequestHandler {

    private final UserService userService;
    @Autowired
    public UserRequestHandler(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/greeting")
    public String sendWelcomePage(){
        return "welcome";
    }

    @GetMapping("/show-register")
    public String sendRegisterPage(@ModelAttribute("userInfo") UserInfoDto userInfoDto){
        return "register";
    }

    @GetMapping("/show-signin")
    public String sendSignInPage(@ModelAttribute("userInfo") UserInfoDto userInfoDto){
        return "signin-page";
    }

    @GetMapping("/signup-user")
    public String registerUser(@Valid @ModelAttribute("userInfo") UserInfoDto userInfoDto, BindingResult result) {
        System.out.println("User name is: " + userInfoDto.getUserName());
        System.out.println("User email is: " + userInfoDto.getEmail());
        System.out.println("User age is: " + userInfoDto.getAge());
        System.out.println("check agree to terms: " + userInfoDto.getAgreedToTerms());
        //model.addAttribute("userInfo",userInfoDto);
        if (result.hasErrors()) {
            System.out.println("----- register has encountered error!");
            result.getAllErrors().stream().forEach(System.out::println);
            return "register";
        }
        try{
            userService.storeUserInfo(new User(userInfoDto.getUserName(), userInfoDto.getUserPassword(),
                    userInfoDto.getEmail(), userInfoDto.getAge()));
        } catch (Exception e) {
            e.printStackTrace();
            return "register";
        }

        return "result-page";
    }

    @PostMapping("/signin-user")
    public String signInForUser(@Valid @ModelAttribute("userInfo") SignInUserInfoDto userInfoDto, BindingResult result, Model model) {
        System.out.println("User name is: " + userInfoDto.getUserName());
        System.out.println("User password is: " + userInfoDto.getUserPassword());

        if (result.hasErrors()) {
            System.out.println("----- sign-in has encountered error!");
            result.getAllErrors().stream().forEach(System.out::println);
            return "signin-page";
        }
        User user;
        try{
            user = userService.getUserGivenUserNameAndPassword(userInfoDto.getUserName(), userInfoDto.getUserPassword());
        } catch (Error e) {
            e.printStackTrace();
            return "signin-page";
        }

        UserInfoDto userDto = new UserInfoDto();
        userDto.setUserName(user.getUserName());
        userDto.setUserPassword("******");
        userDto.setAge(user.getAge());
        userDto.setEmail(user.getEmail());
        userDto.setAgreedToTerms(true);
        model.addAttribute("userInfo",userDto);
        return "result-page";
    }

    @GetMapping("search-user/{id}")
    public String getUserResultGivenId(@PathVariable(name = "id") Long userId, Model model) {
        User user;
        try{
            user = userService.getUserGivenUserId(userId);
        } catch (Error e) {
            e.printStackTrace();
            return "search-page";
        }

        UserInfoDto userDto = new UserInfoDto();
        userDto.setUserName(user.getUserName());
        userDto.setUserPassword("******");
        userDto.setAge(user.getAge());
        userDto.setEmail(user.getEmail());
        userDto.setAgreedToTerms(true);
        model.addAttribute("userInfo",userDto);
        return "result-page";
    }

    @GetMapping("all-user")
    @ResponseBody
    public List<User> getAllUserstatistic(){
        return userService.getAllUsers();
    }
}
