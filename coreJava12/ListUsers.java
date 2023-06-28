package coreJava12;

import java.util.Map;
import java.util.Scanner;

public class ListUsers  implements ManagerManagement{

	@Override
	public Map<BankAccount, User> addUser(Map<BankAccount, User> map, User user, Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<BankAccount, User> searchAccount(Map<BankAccount, User> map, String uname, Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<BankAccount, User> modifyAccount(Map<BankAccount, User> map, String uname, Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<BankAccount, User> deleteAccount(Map<BankAccount, User> map, String uname, Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listUsers(Map<BankAccount, User> map, String uname, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("List of users");
		for(Map.Entry<BankAccount, User> entry: map.entrySet()){
			System.out.println("Name= "+entry.getValue().getUserName());
			System.out.println("Account Number= "+entry.getKey().accountNo);
			System.out.println("Email Id= "+entry.getValue().emailId);
			System.out.println("Phone Number= "+entry.getValue().phoneNo);
			if(entry.getValue().getIfBusinessUser(entry.getValue())) {
				System.out.println("Type of user= "+"Business");	
			}else {
				System.out.println("Type of user= "+"Personal");	
			}
			
			System.out.println("-----------------------------------------");
		}
		
	}
	

}
