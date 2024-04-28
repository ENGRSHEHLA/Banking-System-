package bankingsystem.springboot.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bankingsystem.springboot.model.Transaction;
import bankingsystem.springboot.services.DatabaseTransactionService;

@RestController
public class TransactionController {

	private final DatabaseTransactionService databasetransactionservice;
	
	public TransactionController(DatabaseTransactionService databasetransactionservice)
	{
		this.databasetransactionservice = databasetransactionservice;
		
	}
	@GetMapping("/all2")
	public List<Transaction> getAllTransaction()
	{
		return  databasetransactionservice.getTransactionList();
		
	}
	//localhost:8080/add?amount=557430345670&accountHolder=Romesa&dateOfBirth=20.03.1998
	@PostMapping("/add2")
	public String addTransaction(@RequestParam int amount, 
			@RequestParam String beneficiaryName,
			@RequestParam String IBANnumber,
			@RequestParam String fromIBAN,
			@RequestParam String paymentPurpose,
			// @RequestParam LocalDate transactionDate, // This parameter is missing
			@RequestParam(required = false) LocalDate transactionDate,
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
		return "homepage";	
	}
	@DeleteMapping("/delete2")
	public String deleteTransaction(@RequestParam int id) 
	{
		databasetransactionservice.removeTransaction(id);
		
		return "Successfully record has deleted" + id;

	}
	@PutMapping("/update2")
	public String updateTransaction(@RequestParam int id,
			@RequestParam int amount, 
			@RequestParam String beneficiaryName,
			@RequestParam String IBANnumber,
			@RequestParam String fromIBAN,
			@RequestParam String paymentPurpose,
			@RequestParam LocalDate transactionDate,
			@RequestParam String status)
	{
		Transaction transaction = new Transaction();
		transaction.setId(id);
		transaction.setAmount(amount);
		transaction.setBeneficiaryName(beneficiaryName);
		transaction.setIBANnumber(IBANnumber);
		transaction.setFromIBAN(fromIBAN);
		transaction.setPaymentPurpose(paymentPurpose);
		transaction.setTransactionDate(transactionDate);
		transaction.setStatus(status);
		databasetransactionservice.updateTransaction(id, transaction);
		
		return "Successfully record has updated" + id + "with transaction" + transaction ;
		
	}
	@GetMapping("/get2")
	public String getTransaction(@RequestParam int id)
	{
		return "Successfully record has fetched with id" + id + "by transaction" + databasetransactionservice.getTransaction(id); 
		
	}
	@DeleteMapping("/clear2")
	public String clearTransaction()
	{
		databasetransactionservice.clearTransactionList();
		return "Successfully record has cleared";
		
	}
	
	
}
