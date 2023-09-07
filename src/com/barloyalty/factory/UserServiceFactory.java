package com.barloyalty.factory;

import com.barloyalty.viewmodel.UserService;


public class UserServiceFactory implements IServiceFactory {
    @Override
    public UserService createService() {
        return new UserService();
    }
}
