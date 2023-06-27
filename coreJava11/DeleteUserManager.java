package coreJava11;

import java.util.List;

public class DeleteUserManager implements UserManagement{

	@Override
	public List<BankAccount> modifyUser(List<BankAccount>list , String userName) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public List<BankAccount> deleteUser(List<BankAccount> list,String userName) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			if(list.get(i).user.getUserName().equals(userName)) {
				list.remove(i);
				break;
			}
		}
		System.out.println("User deleted successfully");
		return list;
		
	}

}
