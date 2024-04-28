package bankingsystem.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bankingsystem.springboot.model.Bank;
import bankingsystem.springboot.services.DatabaseBankService;

@RestController
public class BankController {
	
	private final DatabaseBankService databasebankservice;
	
	public BankController(DatabaseBankService databasebankservice)
	{
		this.databasebankservice = databasebankservice;
		
	}
	
	@GetMapping("/all1")
	public List<Bank> getAllBank()
	{
		return databasebankservice.getBankList();
		
	}
	
	@PostMapping("/add1")
	public String addBank(@RequestParam String bankName,
			@RequestParam int code,
			@RequestParam String branch,
			@RequestParam String city, 
			@RequestParam int helpline,
			@RequestParam String manager)
	{
		Bank bank = new Bank();
		bank.setBankName(bankName);
		bank.setCode(code);
		bank.setBranch(branch);
		bank.setCity(city);
		bank.setHelpline(helpline);
		bank.setManager(manager);
		databasebankservice.addBank(bank);
		return "homepage";
		
	}
	
	@DeleteMapping("/delete1")
	public String deleteBank(@RequestParam int id)
	{
		databasebankservice.removeBank(id);
		return "Successfully record has deleted" + id;
		
	}
	
	@PutMapping("/update1")
	public String updateBank(@RequestParam int id,
			@RequestParam String bankName,
			@RequestParam int code,
			@RequestParam String branch,
			@RequestParam String city, 
			@RequestParam int helpline,
			@RequestParam String manager
			)
	{
		Bank bank = new Bank();
		bank.setId(id);
		bank.setBankName(bankName);
		bank.setCode(code);
		bank.setBranch(branch);
		bank.setCity(city);
		bank.setHelpline(helpline);
		bank.setManager(manager);
	    databasebankservice.updateBank(id, bank);
	    return "Successfully record has updated" + id + " with Bank " + bank;
		
	}
	
	@GetMapping("/get1")
	public String getBank(@RequestParam int id)
	{
		return " successfully record has fetched by id " + id + " with bank " + databasebankservice.getBank(id);
		
	}
	@DeleteMapping("/clear1")
	public String clearBank()
	{
		databasebankservice.clearBankList();
		return "Successfully record has cleared";
		
	}

}
