package coreJava12;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DeleteUserManager implements UserManagement{

	@Override
	public Map<BankAccount, User>  modifyUser(Map<BankAccount, User> map , String userName) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public Map<BankAccount, User> deleteUser(Map<BankAccount, User> map ,String userName) {
		// TODO Auto-generated method stub
		for(Entry<BankAccount, User> entry: map.entrySet()) {
			if(entry.getValue().getUserName().equals(userName)) {
				map.remove(entry);
				break;
			}
		}
		System.out.println("User deleted successfully");
		return map;		
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
