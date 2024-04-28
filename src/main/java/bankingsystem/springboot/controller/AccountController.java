package bankingsystem.springboot.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bankingsystem.springboot.model.Account;
import bankingsystem.springboot.services.DatabaseAccountService;

@RestController
public class AccountController {
	
	private final DatabaseAccountService databaseaccountservice;
	
	public AccountController(DatabaseAccountService databaseaccountservice ) 
	{
		this.databaseaccountservice = databaseaccountservice;
	}
	
	@GetMapping("/all")
	public List<Account> getAllAccount()
	{
		return databaseaccountservice .getAccountList();
		
	}
	//localhost:8080/add?accountNumber=557430345670&accountHolder=Romesa&dateOfBirth=20.03.1998
   @PostMapping("/add")
	public String addAccount(@RequestParam String accountNumber, 
			@RequestParam String accountHolder,
			@RequestParam int contactNumber, 
			@RequestParam String typeofAccount, 
			@RequestParam String postalAddress)
	{
	   Account account = new Account();
	   account.setAccountNumber(accountNumber);
	   account.setAccountHolder(accountHolder);
	   account.setContactNumber(contactNumber);
	   account.setTypeofAccount(typeofAccount);
	   account.setPostalAddress(postalAddress);
	   databaseaccountservice.addAccount(account);  
	   return "Account Homepage";
		
	}
 //localhost:8080/delete?index=1
   @DeleteMapping("/delete")
   public String deleteAccount(@RequestParam int id)
   
   { 
	 databaseaccountservice.removeAccount(id);
	return "Successfully record deleted" + id;	   
   
   }
 //localhost:8080/update?
 //localhost:8080/update?accountNumber=0998724509834&accountHolder=Ummama
   @PutMapping("/update")
   public String updateAccount(@RequestParam int id, 
		    @RequestParam String accountNumber, 
			@RequestParam String accountHolder,
			@RequestParam int contactNumber, 
			@RequestParam String typeofAccount, 
			@RequestParam String postalAddress )
   {
	   Account account = new Account();
	   account.setId(id);
	   account.setAccountNumber(accountNumber);
	   account.setAccountHolder(accountHolder);
	   account.setDateOfBirth(dateOfBirth);
	   account.setContactNumber(contactNumber);
	   account.setTypeofAccount(typeofAccount);
	   account.setPostalAddress(postalAddress);
	   databaseaccountservice.updateAccount(id, account);   
	 return "Successfully record has updated" + id + "with Account" + account;  
   }
 //localhost:8080/get?index=1
   @GetMapping("/get")
   public String getAccount(@RequestParam int id)
   {
	return "Successfuly record has fetched by id" + id + " with Account" + databaseaccountservice.getAccount(id);
	   
   }
 //localhost:8080/clear
   @DeleteMapping("/clear")
   public String clearAccount()
   {
	   databaseaccountservice.clearAccountList();
	return "successfully record has cleared";
	   
   }
   

}
