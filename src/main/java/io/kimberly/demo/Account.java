package io.kimberly.demo;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long account_id;
    private Type type;
    private String nickname;
    private Integer rewards;
    private Double balance;
    @ManyToOne
    @JoinColumn(name="customer")
    private Customer customer;

    public Account(){

    }

//    public Account(Enum type, String nickname, Integer rewards, Double balance, Customer customer) {
//        this.type = type;
//        this.nickname = nickname;
//        this.rewards = rewards;
//        this.balance = balance;
//        this.customer = customer;
//    }


    public Long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getRewards() {
        return rewards;
    }

    public void setRewards(Integer rewards) {
        this.rewards = rewards;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_id=" + account_id +
                ", type=" + type +
                ", nickname='" + nickname + '\'' +
                ", rewards=" + rewards +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }
}






