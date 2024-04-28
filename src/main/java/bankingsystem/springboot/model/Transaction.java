package bankingsystem.springboot.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private int amount;
	private String beneficiaryName;
	private String IBANnumber;
	private String fromIBAN;
	private String paymentPurpose;
	private LocalDate transactionDate;
	private String status;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public String getBeneficiaryName() {
		return beneficiaryName;
	}



	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}



	public String getIBANnumber() {
		return IBANnumber;
	}



	public void setIBANnumber(String iBANnumber) {
		IBANnumber = iBANnumber;
	}



	public String getFromIBAN() {
		return fromIBAN;
	}



	public void setFromIBAN(String fromIBAN) {
		this.fromIBAN = fromIBAN;
	}



	public String getPaymentPurpose() {
		return paymentPurpose;
	}



	public void setPaymentPurpose(String paymentPurpose) {
		this.paymentPurpose = paymentPurpose;
	}



	public LocalDate getTransactionDate() {
		return transactionDate;
	}



	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String toString(){
		
	return "Transaction [id = " + id + ", amount = " + amount + ", beneficiaryName = " + beneficiaryName + ","
			+ " IBANnumber = "+ IBANnumber + ", fromIBAN = " + fromIBAN + ", paymentPurpose = " + paymentPurpose +", "
					+ "transactionDate = " + transactionDate + ", status = " + status + "]";
	}
	
	
	
	

}
