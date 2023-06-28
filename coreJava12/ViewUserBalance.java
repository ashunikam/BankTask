package coreJava12;

import java.util.Map;

public class ViewUserBalance implements UserManagement {

	@Override
	public Map<BankAccount, User> modifyUser(Map<BankAccount, User> map, String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<BankAccount, User> deleteUser(Map<BankAccount, User> map, String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<BankAccount, User> ViewUserBalance(Map<BankAccount, User> map, String userName) {
		// TODO Auto-generated method stub
		for(Map.Entry<BankAccount, User> entry: ((Map<BankAccount, User>) map).entrySet()) {
			if(entry.getKey().user.getUserName().equals(userName)) {
				System.out.println("Your Balance is :"+ entry.getKey().getBalance());
				break;
			}else {
				System.out.println("Entered invalid username");
			}
		}
		return map;
	}

	@Override
	public Map<BankAccount, User> getInfo(Map<BankAccount, User> map, String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
