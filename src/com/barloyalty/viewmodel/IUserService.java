package com.barloyalty.viewmodel;

import com.barloyalty.model.User;

public interface IUserService {
    void register(String username, String password);
    User login(String username, String password);
}
