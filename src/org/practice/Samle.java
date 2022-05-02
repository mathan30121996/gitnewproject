package org.practice;

public class Samle {
	public static void main(String[] args) {
		String m = "I am Mathan from Mannargudi";
		//          1 2   3  4    5   6  7  8 9
		int l = m.length();
		System.out.println("length of string: "+l);
		int count =0;
		int co=0;
		for (int i = 0; i < l; i++) {
			char ch = m.charAt(i);
			char v = ' ';
			if (ch == v ) {
				count++;
			}
			
			if (ch=='a'|| ch=='e'||ch=='i'||ch =='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'||ch =='O'||ch=='U') {
				co++;
			}
		
		}
		System.out.println("no of space: "+count);
		
		System.out.println("no of letters: "+(l-count));

		System.out.println("no of vowels :"+co);
	
	
	
	
	
	
	
	
	}
}