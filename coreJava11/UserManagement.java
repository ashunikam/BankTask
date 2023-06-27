package coreJava11;

import java.util.List;

public interface UserManagement {
	List<BankAccount> modifyUser(List<BankAccount> list, String uname);
	List<BankAccount> deleteUser(List<BankAccount> list, String uname);
}
