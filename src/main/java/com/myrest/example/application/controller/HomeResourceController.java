package com.myrest.example.application.controller;


import com.myrest.example.application.data.entity.Account;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResourceController {


    @RequestMapping(value = {"/user"}, produces = {"application/json"},
            method = {RequestMethod.GET})
    @ResponseBody
    public Account user() {

        Account account = new Account();
        account.setAccountNumber("USER");

        return account;
    }

    @RequestMapping(value = {"/admin"}, produces = {"application/json"},
            method = {RequestMethod.GET})
    @ResponseBody
    public Account admin() {
        Account account = new Account();
        account.setAccountNumber("ADMIN");
        return account;
    }

}
