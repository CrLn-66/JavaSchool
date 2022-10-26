package gui;

import java.security.MessageDigest;

public class Testt {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		MessageDigest ms = MessageDigest.getInstance("SHA-256");
		ms.update("Benedictcute".getBytes());
		//System.out.println(new String(ms.digest()));
		StringBuffer hexString = new StringBuffer();
	    byte[] b = ms.digest();
	      for (int i = 0;i<b.length;i++) {
	         hexString.append(Integer.toHexString(0xFF & b[i]));
	      }
	      System.out.println(hexString.toString());
	}

}
