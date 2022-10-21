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

    public UserAccount(int accountId, String accountName, String emailAccount, String password) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.emailAccount = emailAccount;
        this.password = password;
    }

    public String getEmailAccount() {
        return emailAccount;
    }

    public void setEmailAccount(String emailAccount) {
        this.emailAccount = emailAccount;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
