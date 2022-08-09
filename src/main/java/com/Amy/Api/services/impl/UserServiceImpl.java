package com.Amy.Api.services.impl;

import com.Amy.Api.datamodel.User;
import com.Amy.Api.datamodel.repo.UserRepo;
import com.Amy.Api.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements IUserService {


    @Autowired
    UserRepo userRepo;

    /*public List<User> getUsers() {
        Iterable<User> userIterable = userRepo.findAll();
        Iterator<User> it = userIterable.iterator();

        List<User> users = new ArrayList<>();

        while(it.hasNext()) {
            users.add(it.next());
        }

        return users;
    }*/
    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }
    @Override
    public void addUser() {
        User u = new User();
        u.setId(UUID.randomUUID().toString());
        u.setEmail("test@gmail.com");
        u.setPhoneNo(19827191);
        u.setName("test");
        u.setCreatedDate(new Date(System.currentTimeMillis()));

        userRepo.save(u);
    }

}
