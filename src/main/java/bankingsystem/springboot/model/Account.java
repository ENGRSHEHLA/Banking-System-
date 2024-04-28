package bankingsystem.springboot.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String accountNumber;
	private String accountHolder;
	private int contactNumber;
	private String typeofAccount;
	private String postalAddress;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getTypeofAccount() {
		return typeofAccount;
	}
	public void setTypeofAccount(String typeofAccount) {
		this.typeofAccount = typeofAccount;
	}
	public String getPostalAddress() {
		return postalAddress;
	}
	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}
	
	
	public String toString(){
		return " Account [id = " + id + ", accountNumber = " + accountNumber + ", accountHolder = " + accountHolder +", contactNumber = " + contactNumber + ", typeofAccount = " + typeofAccount + ",postalAddress = " + postalAddress + "]";
	
	

}

}
