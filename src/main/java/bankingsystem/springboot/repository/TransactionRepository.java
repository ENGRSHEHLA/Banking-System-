package bankingsystem.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bankingsystem.springboot.model.Transaction;

public interface TransactionRepository  extends JpaRepository<Transaction, Integer>{

}
