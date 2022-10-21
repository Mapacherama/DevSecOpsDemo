package com.devsecops.demo.Controller;

import com.devsecops.demo.Entity.UserAccount;
import com.devsecops.demo.Services.UserAccountImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3200")
public class UserAccountController {
    @Autowired
    UserAccountImplementation userAccountImplementation;

    @GetMapping("/getUsers")
    public List<UserAccount> getUsers(){
        return userAccountImplementation.getUsers();
    }

    @PostMapping("/addUsers")
    public UserAccount addUsers(@RequestBody UserAccount ua) {
        return userAccountImplementation.addUsers(ua);
    }

}
