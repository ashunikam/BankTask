package coreJava12;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ChatBot {
	public static void chatbot() {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		String ans="";
		String password;
		String emailId="";
		String phoneNum="";
		
		BankAccount account=null;
		ModifyUserManager modify=null;
		DeleteUserManager delete=null;
		String userName;
		Manager manager=null;
		User user=null;
		String address="";
		double balance=0;
		int accountNo=0;
		boolean business=false;
		Map<BankAccount, User> map=new HashMap<BankAccount, User>();
		do {

			System.out.println("1.Manager Menu");
			System.out.println("2.User Menu");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Enter username and password");
				userName=sc.next();
				System.out.println("Enter password");
				password=sc.next();
				manager=new Manager("abc", "123");
				if(manager.isValid(userName, password)) {
					System.out.println("Login successfully");
				}else {
					System.out.println("Invalid creadentials");
				}
				do {
					System.out.println("1.Add Account");
					System.out.println("2. Search Account information");
					System.out.println("3. Update User information");
					System.out.println("4. Delete User information");
					System.out.println("5. list information of all users");
					System.out.println("Enter choice");
					choice=sc.nextInt();
					switch(choice) {
					case 1:
						ManagerManagement addUser=new AddManager();
						map=addUser.addUser(map, user, sc);
						break;
					case 2:
						ManagerManagement searchUser=new SearchAccount();
						map=searchUser.addUser(map, user, sc);
						break;
					case 3:
						System.out.println("Enter the UserName for which you want to modify info ");
						modify=new ModifyUserManager();
						userName=sc.next();
						map=modify.modifyUser(map, userName);
						break;
						
					case 4:
						System.out.println("Enter Username for which you want to delete information");
						userName=sc.next();
						delete=new DeleteUserManager();
						map=delete.deleteUser(map, userName);
						break;
					case 5:
						ManagerManagement listUser=new ListUsers();
						listUser.listUsers(map, userName, sc);
						break;
					}
					
					System.out.println("Do you want to continue with manager menu?");
					ans=sc.next();
					}while(ans.equals("Y")||ans.equals("y"));
				break;
			case 2:
				do {
					System.out.println("1. Business User");
					System.out.println("2. Personal User");
					choice=sc.nextInt();
					switch(choice) {
					case 1:
						askChoices(map, user);
					break;
					case 2:
						askChoices(map, user);
					break;

					}
					System.out.println("Do you want to continue type of user selection menu?");
					ans=sc.next();
				}while(ans.equals("Y")||ans.equals("y"));

				break;
				}
					System.out.println("Do you want to continue with user menu?");
					ans=sc.next();
				}
			while(ans.equals("Y")||ans.equals("y"));
	}
	public static void askChoices(Map<BankAccount, User>map, User user) {
		String userName="";
		String password="";
		int choice=0;
		String ans="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username and password");
		userName=sc.next();
		password=sc.next();
		do {
			System.out.println("1. View Balance");
			System.out.println("2.User details");
			System.out.println("Enter choice");
			choice=sc.nextInt();
				switch(choice) {
				case 1:
					UserManagement viewBal=new ViewUserBalance();
					viewBal.ViewUserBalance(map, userName);
					break;
				case 2:
					UserManagement getInfo=new GetUserInfo();
					map=getInfo.getInfo(map, userName);
					
					break;
				}
				System.out.println("Do you want to continue?");
				ans=sc.next();
		}while(ans.equals("Y")||ans.equals("y"));
	
	}
}
