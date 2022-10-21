package com.devsecops.demo.Services;

import com.devsecops.demo.Entity.UserAccount;
import com.devsecops.demo.Repository.UserAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserAccountImplementation implements UserAccountService{

    @Autowired
    UserAccountRepo userLoginRepository;
    @Override
    public List<UserAccount> getUsers() {
        return userLoginRepository.findAll();
    }

    @Override
    public UserAccount addUsers(UserAccount ua) {
        return userLoginRepository.save(ua);
    }
}
