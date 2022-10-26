package gui;

import java.security.MessageDigest;

public class User {
	static private String passwordEnc = "26c1c9b4ec1e8fd494ac29c598f3ebefb2ad9ba586b761d9e56ac1a143cafa";
	
	
	public static boolean login(String password) throws Exception{
		MessageDigest ms = MessageDigest.getInstance("SHA-256");
		ms.update(password.getBytes());
		StringBuffer hexString = new StringBuffer();
	    byte[] b = ms.digest();
	      for (int i = 0;i<b.length;i++) {
	         hexString.append(Integer.toHexString(0xFF & b[i]));
	      }
		if(hexString.toString().equals(passwordEnc)) {
			return true;
		}
		return false;
	}
}
