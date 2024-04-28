package bankingsystem.springboot.services;
import java.util.List;

import org.springframework.stereotype.Service;

import bankingsystem.springboot.model.Bank;
import bankingsystem.springboot.repository.BankRepository;


@Service
public class DatabaseBankService {

	public final BankRepository bankRepository;
	
	public DatabaseBankService(BankRepository bankRepository)
	{
		this.bankRepository = bankRepository;	
	}
	public void addBank(Bank bank)
	{
		bankRepository.save(bank);
	}
	public void removeBank(int id) 
	{
		bankRepository.deleteById(id);
	}
	
	public void updateBank(int id, Bank bank)
	{
		Bank oldbank = bankRepository.findById(id).get();
		oldbank.setBankName(bank.getBankName());
		oldbank.setCode(bank.getCode());
		oldbank.setBranch(bank.getBranch());
		oldbank.setCity(bank.getCity());
		oldbank.setHelpline(bank.getHelpline());
		bankRepository.save(oldbank);
	}
	
	public Bank getBank(int id) {
		return bankRepository.findById(id).get();
		
	}
	public List<Bank> getBankList()
	{
		return bankRepository.findAll();
		
	}
	public void clearBankList()
	{
	 bankRepository.deleteAll();
	}
	
}
