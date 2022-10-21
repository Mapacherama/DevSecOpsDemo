package com.devsecops.demo.Services;

import com.devsecops.demo.Entity.UserAccount;

import java.util.List;

public interface UserAccountService {
    List<UserAccount> getUsers();
    UserAccount addUsers(UserAccount ua);
}
