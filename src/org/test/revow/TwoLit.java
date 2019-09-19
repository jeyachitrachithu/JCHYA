package org.test.revow;

public class TwoLit {
	public static void main(String[] args) {
		String S="Nisha";
		String S1="Nisha";
		System.out.println(System.identityHashCode(S));
		System.out.println(System.identityHashCode(S1));
	}

}
