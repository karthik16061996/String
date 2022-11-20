package org.string;

public class Login {
public static void main(String[] args) {
	String s = "welcome";
	System.out.println(s);
	
	// number of letters in length in string
	int le = s.length();
	System.out.println(le);
	
	// string start same or not
	boolean b= s.startsWith("wel");
	System.out.println(b);
	
	// string end same or not
	boolean e = s.endsWith("co");
	System.out.println(e);
	
	// string contains same or not
	boolean d = s.contains("co");
	System.out.println(d);
	
	// find the particular index letter
	int p = s.indexOf("l");
	System.out.println(p);
	
	// find the last index letter
	int q = s.lastIndexOf("e");
	System.out.println(q);
	
	// change one letter to another letter
	String i = s.replaceAll("e","lol");
	System.out.println(i);
	
	// change all letter of upper case
	String up = s.toUpperCase();
	System.out.println(up);
	System.out.println("123546");
	
	// change all letter of lower case
	String lw = s.toLowerCase();
	System.out.println(lw);
}
}
