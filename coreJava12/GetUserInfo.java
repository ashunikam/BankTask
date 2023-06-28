package coreJava12;

import java.util.Map;

public class GetUserInfo implements UserManagement{

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
		return null;
	}

	@Override
	
		
		public Map<BankAccount,User>  getInfo(Map<BankAccount,User> map,String uname) {
		boolean flag=false;
			for(Map.Entry<BankAccount, User> entry: map.entrySet()) {
				if(entry.getValue().getUserName().equals(uname)) {
					System.out.println("User name is : " +entry.getValue().getUserName());
					System.out.println("Address is : " +entry.getValue().getAddress());
					System.out.println("Account Number : "+entry.getKey().getAccountNo());
					System.out.println("Email id is : "+entry.getValue().getEmailId());
					flag=true;
					if(entry.getValue().getIfBusinessUser(entry.getValue())) {
						System.out.println("Type of User: "+ "Business");
					}
					else {
						System.out.println("Type of User: "+ "Personal");
					}
					break;
				}
			}
			if(!flag) {
				System.out.println("Entered invalid Username");
			}
			return map;
		}

}
