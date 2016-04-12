package com.jackman.spring.service;

/**
 * Created by JackMan on 2016/4/11.
 */
public class DefaultServiceLocator {
    private static ClientService clientService = new ClientService();
    private static AccountService accountService = new AccountService();

    private DefaultServiceLocator() {
    }

    public ClientService createClientServiceInstance() {
        return clientService;
    }

    public AccountService createAccountServiceInstance() {
        return accountService;
    }
}
