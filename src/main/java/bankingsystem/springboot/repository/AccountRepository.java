package bankingsystem.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bankingsystem.springboot.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
