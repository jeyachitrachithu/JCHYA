package org.test.revow;

public class LitraStr {
	public static void main(String[] args) {
		String s1="Nisha";
		String s2="Gangan";
		String s3=s1.concat(s2);
		System.out.println(s3);
		String s4="NishaGangan";
		int l=System.identityHashCode(s1);
		System.out.println(l);
		int l1=System.identityHashCode(s2);
		System.out.println(l1);
		int l2=System.identityHashCode(s3);
		System.out.println(l2);
		System.out.println(System.identityHashCode(s4));
		
		
		
		
	}

}
