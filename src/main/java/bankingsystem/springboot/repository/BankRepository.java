package bankingsystem.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bankingsystem.springboot.model.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer>{

}
