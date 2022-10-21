package com.devsecops.demo.Services;

import com.devsecops.demo.Dto.UserAccountDto;

import java.util.List;

public interface UserAccountService {
    List<UserAccountDto> getUsers();
    void addUser(UserAccountDto ua);
}
