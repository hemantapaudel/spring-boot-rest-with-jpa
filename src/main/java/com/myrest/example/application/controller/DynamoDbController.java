package com.myrest.example.application.controller;

import com.myrest.example.application.dynamodb.Account;
import com.myrest.example.application.dynamodb.AccountDynamoDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/dynamodb")
public class DynamoDbController {

    @Autowired
    AccountDynamoDbService accountDynamoDbService;


    @RequestMapping(value = {"/accounts"}, produces = {"application/json"},
            method = {RequestMethod.GET})
    @ResponseStatus(HttpStatus.OK)
    public List<Account> getAccounts() throws Exception {
        List<Account> accounts = accountDynamoDbService.findAll();
        return accounts;
    }

    @RequestMapping(value = {"/createaccounts"}, produces = {"application/json"}, method = {RequestMethod.GET})
    public Account createAccount() {
        return accountDynamoDbService.create(null);
    }


    @RequestMapping(value = {"/deleteaccounts"}, produces = {"application/json"}, method = {RequestMethod.GET})
    @ResponseStatus(HttpStatus.OK)
    public List<Account> deleteAll() throws Exception {
        List<Account> accountList = accountDynamoDbService.findAll();
        accountList.parallelStream().forEach(account -> accountDynamoDbService.delete(account.getAccountNumber()));
        return accountList;
    }

}
