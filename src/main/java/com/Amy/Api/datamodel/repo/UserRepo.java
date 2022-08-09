package com.Amy.Api.datamodel.repo;

import com.Amy.Api.datamodel.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserRepo extends PagingAndSortingRepository<User, String> {
    List<User> findAll();
}
