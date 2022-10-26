package com.devsecops.demo.Controller;

import com.devsecops.demo.Dto.UserAccountDto;
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
    public List<UserAccountDto> getUsers(){
        return userAccountImplementation.getUsers();
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody UserAccountDto ua) {
        return "User has been added" + ua.toString();
    }

}
