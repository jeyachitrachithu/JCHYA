package org.test.revow;

public class RepVow {
public static void main(String[] args) {
	String v="WelcomE";
	System.out.println(v);
	String w=v.replaceAll("[AaEeIiOoUu]","@");
	System.out.println(w);
}
}
