package com.devsecops.demo.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountDto {
    private Long AccountId;
    @NotEmpty
    private String accountName;
    @NotEmpty(message = "Email should not be empty")
    @Email
    private String emailAccount;
    @NotEmpty(message = "Password should not be empty")
    private String password;

}
