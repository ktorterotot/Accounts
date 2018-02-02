package io.kimberly.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class AccountController {

@Autowired
   private AccountService accountService;


@RequestMapping("/accounts")
    public List<Account>getAllAccounts(){
    return accountService.getAllAccounts();
}

@RequestMapping("/accounts/{customer_Id}")
    public Account getAccount(@PathVariable Long customer_Id){
        return accountService.getAccount(customer_Id);
    }

    @RequestMapping("/customers/{customer_Id}/accounts")
    public Account getAccountByCustomerId(@PathVariable Long customer_Id){
        return accountService.getAccountByCustomerId(customer_Id);
    }


@RequestMapping(method = RequestMethod.PUT, value = "/accounts/{account_id}")
    public void updateAccount(@RequestBody Account account, @PathVariable Long account_id){
    accountService.updateAccount(account_id, account);
}

    @RequestMapping(method = RequestMethod.POST, value = "/customers/{customer_Id}/accounts")
    public void addAccount(@RequestBody Account account, @PathVariable Long customer_Id){
        accountService.addAccount(account);
    }




    @RequestMapping(method = RequestMethod.DELETE, value = "/accounts/{account_id}")
    public void deleteAccount(@PathVariable Long account_id){
    accountService.deleteAccount(account_id);
}
}
