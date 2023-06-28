package coreJava12;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ModifyUserManager implements UserManagement {

	@Override
	public Map<BankAccount, User>  modifyUser(Map<BankAccount, User> map, String userName) {
		int choice=0;
		String ans="";
		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).user.userName.equals(userName)) {
		for(Entry<BankAccount, User> entry:map.entrySet()) {
			if(entry.getKey().user.getUserName().equals(userName)) {
				do {
				System.out.println("Which inofrmation do you want to update");
				System.out.println("1. Name");
				System.out.println("2. Password");
				System.out.println("3. EmailId");
				System.out.println("4. Phone number");
				System.out.println("5. Address");
				System.out.println("Enter your choice");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					String name="";
					System.out.println("Enter name of user");
					name=sc.next();
					entry.getValue().setUserName(name);
					System.out.println("------------------------");
					System.out.println("Modified with name");
				break;
				case 2:
					String password="";
					System.out.println("Enter password of user");
					password=sc.next();
					entry.getValue().setPassword(password);
					System.out.println("------------------------");
					System.out.println("Modified with password");
					break;
				case 3:
					String email="";
					System.out.println("Enter email of user");
					email=sc.next();
					entry.getValue().setEmailId(email);
					System.out.println("------------------------");
					System.out.println("Modified with emailId");
					break;
				case 4: 
					String phoneNum="";
					System.out.println("Enter phone Number of user");
					phoneNum=sc.next();
					entry.getValue().setPhoneNo(phoneNum);
					System.out.println("------------------------");
					System.out.println("Modified with phoneNum");
					break;
				case 5: 
					String address="";
					System.out.println("Enter address of user");
					address=sc.next();
					entry.getValue().setAddress(address);
					System.out.println("------------------------");
					System.out.println("Modified with address");
					break;
					default:
						System.out.println("Entered invalid choice");

				}
				System.out.println("Do want to continue with modify details");
				ans=sc.next();
				
				}while(ans.equals("Y")|| ans.equals("y"));
				
			}
		}
		System.out.println("User modified successfully");
		return map;
		
	}

	

	@Override
	public Map<BankAccount, User> deleteUser(Map<BankAccount, User> map, String userName) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Map<BankAccount, User> ViewUserBalance(Map<BankAccount, User> map, String userName) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Map<BankAccount, User> getInfo(Map<BankAccount, User> map, String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
