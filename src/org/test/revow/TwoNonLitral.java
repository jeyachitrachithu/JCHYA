package org.test.revow;

public class TwoNonLitral {
	public static void main(String[] args) {
		String a=new String ("Nisha");
		String a1=new String ("nisha");
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(a1));
	}

}
