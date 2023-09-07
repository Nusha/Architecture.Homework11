package com.barloyalty.viewmodel;

import com.barloyalty.model.User;

import java.util.List;

public class UserService  implements IUserService{
    private List<User> users;
    @Override
    public void register(String username, String password) {

    }

    @Override
    public User login(String username, String password) {
        return null;
    }
}
