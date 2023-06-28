package coreJava12;
import java.util.*;
import java.util.Map.Entry;

public class User {
	
	String userName;
	String password;
	String address;
	String phoneNo;
	String emailId;
	String isBusinessUser;
	
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

	public User(String userName,String password,String address,String phoneNo, String emailId, String isBusinessUser) {
		
		this.userName=userName;
		this.password=password;
		this.address=address;
		this.phoneNo=phoneNo;
		this.emailId=emailId;
		this.isBusinessUser=isBusinessUser;
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
	public boolean getIfBusinessUser(User user) {
		if(isBusinessUser.equals("Yes")||isBusinessUser.equals("yes")) {
			return true;
		}
		return false;
	}
	public boolean isValid(Map<BankAccount, User>map, String userName, String password) {
		for(Map.Entry<BankAccount, User> entry:map.entrySet()) {
			if(entry.getValue().getUserName().equals(userName) && entry.getValue().getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	

}
