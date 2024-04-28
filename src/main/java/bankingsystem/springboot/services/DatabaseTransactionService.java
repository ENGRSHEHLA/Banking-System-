package bankingsystem.springboot.services;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import bankingsystem.springboot.model.Transaction;
import bankingsystem.springboot.repository.TransactionRepository;



      @Service
      public class DatabaseTransactionService {
	
	  public final TransactionRepository transactionRepository;
	  
	  public DatabaseTransactionService(TransactionRepository transactionRepository)
	  {
	  
		this.transactionRepository =transactionRepository;
		  
	  }
	 // public void addTransaction(Transaction transaction)
	 // {
		//  transactionRepository.save(transaction);
	//  }
	  public void addTransaction(Transaction transaction) {
	        // Set the current date as the transaction date if not provided
	        if (transaction.getTransactionDate() == null) {
	            transaction.setTransactionDate(LocalDate.now());
	        }
	        transactionRepository.save(transaction);
	    }
// other method is correct
	  
	  public void removeTransaction(int id)
	  {
		  transactionRepository.deleteById(id);
	  }
	  
	  //public void updateTransaction( Transaction oldtransaction2, Transaction transaction) 
	 // {
		//  Transaction oldtransaction  = transactionRepository.findById(id).orElse(null);
		 // if (oldtransaction != null) {
	            // Update only if the transaction exists
	            
	         
		 // oldtransaction.setAmount(transaction.getAmount());
		 // oldtransaction.setBeneficiaryName(transaction.getBeneficiaryName());
		 // oldtransaction.setIBANnumber(transaction.getBeneficiaryName());
		 // oldtransaction.setFromIBAN(transaction.getFromIBAN());
		 // oldtransaction.setPaymentPurpose(transaction.getPaymentPurpose());
		//  oldtransaction.setTransactionDate(transaction.getTransactionDate());
		//  oldtransaction.setStatus(transaction.getStatus());
		 // updateTransaction(oldtransaction, transaction);
		 // transactionRepository.save(oldtransaction);	  
		 // }
		 // }
	  public void updateTransaction(int id, Transaction transaction) {
	        Transaction oldTransaction = transactionRepository.findById(id).orElse(null);
	        if (oldTransaction != null) {
	            // Update only if the transaction exists
	            updateTransaction(oldTransaction, transaction);
	            transactionRepository.save(oldTransaction);
	        }
	    }
	  
	  public Transaction getTransaction(int id) {
	        return transactionRepository.findById(id).orElse(null);
	    }

	    public List<Transaction> getTransactionList() {
	        return transactionRepository.findAll();
	    }

	    public void clearTransactionList() {
	        transactionRepository.deleteAll();
	    }

	  //public Transaction getTransaction(int id)
	//  {
	//	return transactionRepository.findById(id).get();
		  
	 // }
	 // public List<Transaction> getTransactionList()
	 // {
	//	return transactionRepository.findAll();	  
	 // }
	  
	//  public void clearTransactionList()
	//  {
		//  transactionRepository.deleteAll();
	  //}
	    private void updateTransactionFields(Transaction oldTransaction, Transaction newTransaction) {
	        // Update the fields of oldTransaction with the fields of newTransaction
	        oldTransaction.setAmount(newTransaction.getAmount());
	        oldTransaction.setBeneficiaryName(newTransaction.getBeneficiaryName());
	        oldTransaction.setIBANnumber(newTransaction.getIBANnumber());
	        oldTransaction.setFromIBAN(newTransaction.getFromIBAN());
	        oldTransaction.setPaymentPurpose(newTransaction.getPaymentPurpose());
	        oldTransaction.setTransactionDate(newTransaction.getTransactionDate());
	        oldTransaction.setStatus(newTransaction.getStatus());
	    }
	}
	  


