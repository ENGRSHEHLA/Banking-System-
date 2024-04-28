package bankingsystem.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bank {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String bankName;
	private int code;
	private String branch;
	private String city;
	private int helpline;
	private String manager;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getHelpline() {
		return helpline;
	}
	public void setHelpline(int helpline) {
		this.helpline = helpline;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	
	public String toString() {
		return " Bank [id = " + id +",bankName = " + bankName + ",code = " + code + ", branch = "+ branch +" , city = " + city +","
				+ " helpline = " + helpline + ", manager =  " + manager + "]";
	}

}
