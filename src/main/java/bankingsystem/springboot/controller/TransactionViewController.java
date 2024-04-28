package bankingsystem.springboot.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bankingsystem.springboot.model.Transaction;
import bankingsystem.springboot.services.DatabaseTransactionService;


@Controller
public class TransactionViewController {

	public final DatabaseTransactionService databasetransactionservice;
	
	public TransactionViewController(DatabaseTransactionService databasetransactionservice)
	{
		this.databasetransactionservice = databasetransactionservice;
		
	}
	@GetMapping("/transaction")
	private String showTransaction()
	{
		return "Tansaction";
		
	}
	
	@PostMapping("/transactionAdd")
	public String addTansaction(@RequestParam int amount, 
			@RequestParam String beneficiaryName,
			@RequestParam String IBANnumber,
			@RequestParam String fromIBAN,
			@RequestParam String paymentPurpose,
			@RequestParam LocalDate transactionDate,
			@RequestParam String status) 
	{
		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		transaction.setBeneficiaryName(beneficiaryName);
		transaction.setIBANnumber(IBANnumber);
		transaction.setFromIBAN(fromIBAN);
		transaction.setPaymentPurpose(paymentPurpose);
		transaction.setTransactionDate(transactionDate);
		transaction.setStatus(status);
		databasetransactionservice.addTransaction(transaction);
		return "redirect:/showAll";
	}
	@GetMapping("//transactionAdd")
	public String addTransactionDetails()
	{
		return "Transaction Details";
		
	}
	@GetMapping("/showAll2")
	public String addTansaction(Model model)
	{
		model.addAttribute("transaction", databasetransactionservice.getTransactionList());
		return "homepage";
		
	}
	@GetMapping("/delete2/{id}")
	public String deleteTransaction(@PathVariable int id)
	{
		databasetransactionservice.removeTransaction(id);
		return "redirect:/showAll";
		
	}
	@GetMapping("edit2/{id}")
	public String editTransaction(@PathVariable int id, Model model)
	{
		Transaction transaction = databasetransactionservice.getTransaction(id);
		model.addAttribute("transaction", transaction);
		return "edit- Transaction Details";	
	}
	@PostMapping("/updateTransaction")
	public String updateTransaction(Transaction transaction)
	{
		databasetransactionservice.updateTransaction(transaction.getId(), transaction);
		return "redirect:/showAll";
		
	}
	
	
	
}
