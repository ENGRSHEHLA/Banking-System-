package bankingsystem.springboot.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bankingsystem.springboot.model.Account;
import bankingsystem.springboot.services.DatabaseAccountService;

@Controller
public class AccountViewController {
	
	public final DatabaseAccountService databaseaccountservice;
	
	public AccountViewController(DatabaseAccountService databaseaccountservice) 
	{
		this.databaseaccountservice = databaseaccountservice;	
	}

	@GetMapping("/account")
	private String showAccount() 
	{
		return "Account";	
	}
	
	@PostMapping("/accountAdd")
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
		return "redirect/showAll";
		
	}
	
	@GetMapping("/accountAdd")
    public String addAccountDetails()
    {
		return "Account Details";			
    }
	
	@GetMapping("/showAll1")
	public String addAccount(Model model)
	{
		model.addAttribute("account", databaseaccountservice.getAccountList());
		return "homepage";	
	}
	@GetMapping("/delete1/{id}")
	public String deleteAccount(@PathVariable int id)
	
	{
		databaseaccountservice.removeAccount(id);
		return "redirect:/showAll";	
	}
	
	@GetMapping("/edit1/{id}")
	public String showEditAccount(@PathVariable int id, Model model)
	{
		Account account = databaseaccountservice.getAccount(id);
		model.addAttribute("account", account);
		return "edit- account";	
	}
	@PostMapping("/updateAccount")
	public String updateAccount(Account account) 
	{
		databaseaccountservice.updateAccount(account.getId(), account);
		return "redirect:/showAll";
		
	}
	
}
