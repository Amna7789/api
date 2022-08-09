package com.Amy.Api.services;

import com.Amy.Api.datamodel.User;

import java.util.List;

public interface IUserService {

    public List<User> getUsers();

    public void addUser();
}
