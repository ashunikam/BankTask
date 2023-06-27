package coreJava11;
import java.util.*;

public class User {
	
	String userName;
	String password;
	String address;
	String phoneNo;
	String emailId;
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public User(String userName,String password,String address,String phoneNo, String emailId) {
		
		this.userName=userName;
		this.password=password;
		this.address=address;
		this.phoneNo=phoneNo;
		this.emailId=emailId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void getInfo(List<BankAccount> list,String uname, int accountNo) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).user.getUserName().equals(uname)) {
				System.out.println("User name is : "+list.get(i).user.getUserName());
				System.out.println("Address is : "+list.get(i).user.getAddress());
				System.out.println("Account Number : "+accountNo );
			}
		}
	}

}
