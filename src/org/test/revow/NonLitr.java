package org.test.revow;

public class NonLitr {
public static void main(String[] args) {
	String s1=new String ("Nisha");
	String S2=new String ("Ganesh");
	String s3=new String ("NishaGanesh");
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(S2));
	System.out.println(System.identityHashCode(s3));
}
}
