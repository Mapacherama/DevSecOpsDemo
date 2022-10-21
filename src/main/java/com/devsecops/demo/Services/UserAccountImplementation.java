package com.devsecops.demo.Services;

import com.devsecops.demo.Dto.UserAccountDto;
import com.devsecops.demo.Entity.UserAccount;
import com.devsecops.demo.Repository.UserAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserAccountImplementation implements UserAccountService{

    @Autowired
    UserAccountRepo userLoginRepository;
    @Override
    public List<UserAccountDto> getUsers() {
        List<UserAccount> users = userLoginRepository.findAll();

        return users.stream().map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    private UserAccountDto convertEntityToDto(UserAccount user){
        UserAccountDto userAccountDto = new UserAccountDto();
        String name = user.getAccountName();
        userAccountDto.setAccountName(name);
        userAccountDto.setEmailAccount(user.getEmailAccount());
        return userAccountDto;
    }
    @Override
    public void addUser(UserAccountDto userAccountDto) {
        UserAccount userAccount = new UserAccount();
        userAccount.setAccountName(userAccountDto.getAccountName());
        userAccount.setEmailAccount(userAccountDto.getEmailAccount());
        userAccount.setPassword(userAccountDto.getPassword());

        userLoginRepository.save(userAccount);
    }
}
