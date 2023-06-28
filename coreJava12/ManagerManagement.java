package coreJava12;

import java.util.Map;
import java.util.Scanner;

public interface ManagerManagement {
	public Map<BankAccount, User>addUser(Map<BankAccount, User>map,User user,Scanner sc);
	public Map<BankAccount, User>searchAccount(Map<BankAccount, User>map,String uname,Scanner sc);
	public Map<BankAccount, User>modifyAccount(Map<BankAccount, User>map,String uname,Scanner sc);
	public Map<BankAccount, User>deleteAccount(Map<BankAccount, User>map,String uname,Scanner sc);
	public void listUsers(Map<BankAccount, User>map,String uname,Scanner sc);

}
