package coreJava12;

import java.util.List;
import java.util.Map;

public interface UserManagement {
	Map<BankAccount, User> modifyUser(Map<BankAccount, User> map, String userName);
	Map<BankAccount, User> deleteUser(Map<BankAccount, User> map, String userName);
	Map<BankAccount, User> ViewUserBalance(Map<BankAccount, User> map, String userName);
	Map<BankAccount, User> getInfo(Map<BankAccount, User> map, String userName);
}
