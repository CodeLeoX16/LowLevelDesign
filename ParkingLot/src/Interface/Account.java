package Interface;

import constants.AccountStatus;
import models.Person;

public abstract class Account {
    private string username;
    private string  pwd;
    private Person person;
    private AccountStatus status;
    public abstract boolean resetPassword();

}
