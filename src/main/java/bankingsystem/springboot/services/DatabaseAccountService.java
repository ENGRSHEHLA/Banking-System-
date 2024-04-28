package bankingsystem.springboot.services;
import java.util.List;

import org.springframework.stereotype.Service;
import bankingsystem.springboot.model.Account;
import bankingsystem.springboot.repository.AccountRepository;



@Service
public class DatabaseAccountService {

	public final AccountRepository accountRepository;

	public DatabaseAccountService(AccountRepository accountRepository)

	{
		this.accountRepository = accountRepository;

	}

	public void addAccount(Account account) 
	{
		   accountRepository.save(account);
	}

	public void removeAccount(int id) 
	{
		  accountRepository.deleteById(id);
	}

	public void updateAccount(int id, Account account)
	{
		 Account oldaccount = accountRepository.findById(id).get();
		 oldaccount.setAccountNumber(account.getAccountNumber());
		 oldaccount.setAccountHolder(account.getAccountHolder());
		 oldaccount.setDateOfBirth(account.getDateOfBirth());
		 oldaccount.setContactNumber(account.getContactNumber());
		 oldaccount.setTypeofAccount(account.getTypeofAccount());
		 oldaccount.setPostalAddress(account.getPostalAddress());
		 accountRepository.save(oldaccount);
	}

	public Account getAccount(int id) 
	{
		return accountRepository.findById(id).get();
 
	}

	public List<Account> getAccountList()
	{
		return accountRepository.findAll();
		
	}
	
	public void clearAccountList()
	{
		accountRepository.deleteAll();
	}
}
