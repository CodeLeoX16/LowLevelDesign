package models;

import constants.AccountType;

public abstract class Account {

    protected int id;
    protected String name;
    protected String email;
    protected String phone;
    protected String password;
    protected AccountType accountType;

    public Account(int id, String name, String email, String phone,
                   String password, AccountType accountType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.accountType = accountType;
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public void logout() {
        System.out.println(name + " logged out.");
    }
}