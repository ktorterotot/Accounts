package io.kimberly.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

   @Autowired
   AccountRepository accountRepository;

    public List<Account> getAllAccounts(){
        List<Account> accounts = new ArrayList<>();
        accountRepository.findAll().forEach(accounts::add);
        return accounts;
    }

    public Account getAccount(Long customer_Id){
        return accountRepository.findOne(customer_Id);
    }

    public void addAccount(Account account){
        accountRepository.save(account);
    }

    public Account getAccountByCustomerId(Long customer_id){
        return accountRepository.findOne(customer_id);
    }

    public void updateAccount(Long account_id, Account account){
        accountRepository.save(account);
    }

    public void deleteAccount(Long id){
        accountRepository.delete(id);
    }


}
