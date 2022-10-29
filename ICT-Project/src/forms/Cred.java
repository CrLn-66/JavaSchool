package forms;

import java.util.HashMap;

public class Cred {
	public static HashMap<String, User> account = new HashMap<String, User>();
	
	public static Object login(String username, String password) {
		if(!account.containsKey(username))  return null;
		if(!account.get(username).getPassword().equals(password)) return null;
		System.out.println(true);
		return account.get(username);
	}
	
	public static int signup(String username, User user) {
		if(account.containsKey(username))  return 1;
		System.out.println(0);
		account.put(username, user);
		return 0;
	}
}
