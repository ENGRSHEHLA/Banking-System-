package bankingsystem.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bankingsystem.springboot.model.Bank;
import bankingsystem.springboot.services.DatabaseBankService;

@Controller
public class BankViewController {
	
	public final DatabaseBankService databasebankservice;
	
	public BankViewController(DatabaseBankService databasebankservice)
	{
		this.databasebankservice = databasebankservice;
		
	}
	@GetMapping("/Form")
	private String showForm()
	{
		return "Bank";
		
	}
	@PostMapping("/formAdd")
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
		return "redirect /showAll";
		
	}
	@GetMapping("/formAdd")
	public String addBankDetails()
	{
		return "Bank Details";
		
	}
	@GetMapping("/showAll")
	public String addBank(Model model)
	{
		model.addAttribute("bank",databasebankservice.getBankList());
		return "homepage";
		
	}
	@GetMapping("/delete/{id}")
	public String deleteBank(@PathVariable int id)
	
	{ 
		databasebankservice.removeBank(id);
		return "redirect:/showAll";
	}
	
	@GetMapping("/edit/{id}")
	public String showEditBankDetails(@PathVariable int id, Model model)
	{
		Bank bank = databasebankservice.getBank(id);
		model.addAttribute("bank", bank);
		return "edit- BankDetails";
	}
	@PostMapping("/updateBank")
	public String updateBank(Bank bank)
	
	{ 
		databasebankservice.updateBank(bank.getId(), bank);
	    return "redirect:/showAll";
		
	}

	
}
