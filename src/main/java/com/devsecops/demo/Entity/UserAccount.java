package com.devsecops.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name="useraccount")
public class UserAccount {
    @Id
    @Column(name="AccountId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;

    @Column(name="AccountName")
    private String accountName;

    @Column(name="EmailAccount")
    private String emailAccount;

    @Column(name="Password")
    private String password;

    public UserAccount() {
        super();
    }

    public UserAccount(int accountId, String accountName, String emailId, String password) {
        super();
        this.accountId = accountId;
        this.accountName = accountName;
        this.emailId = emailId;
        this.password = password;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
