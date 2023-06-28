package coreJava12;

import java.util.Map;
import java.util.Scanner;

public class SearchAccount implements ManagerManagement{

	@Override
	public Map<BankAccount, User> addUser(Map<BankAccount, User> map, User user, Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<BankAccount, User> searchAccount(Map<BankAccount, User> map, String uname, Scanner sc) {
		// TODO Auto-generated method stub
		boolean searchFlag=false;
		String userName="";
		int accountNo=0;
		User user=null;
		System.out.println("Enter the UserName for which you want info");
		userName=sc.next();
		for(Map.Entry<BankAccount, User> entry: map.entrySet()){
			if(entry.getKey().user.getUserName().equals(userName)) {
				searchFlag=true;
				accountNo=entry.getKey().accountNo;
				UserManagement viewUser=(UserManagement) new GetUserInfo();
				viewUser.getInfo(map, userName);
				break;
			}
		}
		if(searchFlag==false) {
			System.out.println("UserName does not exists");
		}
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
		
	}

}
