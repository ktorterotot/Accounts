package io.kimberly.demo;

public class Data {

    private Account account;

    public Data() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Data{" +
                "account=" + account +
                '}';
    }
}
