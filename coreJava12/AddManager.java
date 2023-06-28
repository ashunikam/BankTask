package coreJava12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddManager implements ManagerManagement{

	@Override
	public Map<BankAccount, User> addUser(Map<BankAccount, User> map, User user,Scanner sc) {
		// TODO Auto-generated method stub
		String userName,password,address,phoneNum,emailId,ans;
		List<User> listUser=new ArrayList<>();
		BankAccount account=null;
		double balance;
		int accountNo=0;
		System.out.println("Enter username");
		userName=sc.next();
		System.out.println("Enter password");
		password=sc.next();
		System.out.println("Enter Address");
		address=sc.next();
		System.out.println("Enter Balance");
		balance=sc.nextDouble();
		System.out.println("Enter phone number");
		phoneNum=sc.next();
		System.out.println("Enter Email Id");
		emailId=sc.next();
		System.out.println("Are you a business user?");
		ans=sc.next();
		user=new User(userName, password, address, phoneNum, emailId,ans);
		account=new BankAccount(user,balance);
		map.put(account, user);
		System.out.println("Account is created");
		accountNo=account.accountNo;
		System.out.println("Your accout number is "+ accountNo);
		
		return map;
	}

	@Override
	public Map<BankAccount, User> searchAccount(Map<BankAccount, User> map, String uname,Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<BankAccount, User> modifyAccount(Map<BankAccount, User> map, String uname,Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<BankAccount, User> deleteAccount(Map<BankAccount, User> map, String uname,Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listUsers(Map<BankAccount, User> map, String uname, Scanner sc) {
		// TODO Auto-generated method stub
		
	}

}
