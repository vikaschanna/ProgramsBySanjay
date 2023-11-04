package NumberSeriesPrograms;

import java.util.Arrays;
import java.util.HashSet;

import org.testng.annotations.Test;

public class primeNoTest {
	@Test
	public void primeNo() {
		int n=6,a=1;
//		System.out.println(1);
		for (int i =1; i <= n; i++) {
			System.out.println(a);
			a=(a*2)+1;
			
		}
		
	}
	
	@Test
	public void primeNo1() {
		int n=7,sum=0;
//		System.out.println(1);
		for (int i = 2; i <= n; i++) {
			if(n%i==0) {
				sum=sum+1;
			}
		}
		if(sum>0) {
			System.out.println("The number "+n+" is a prime number");
		}else {
			System.out.println("Not a prime");
		}
	}
	
	@Test
	public void prime() {
		int num=100;
		for (int i = 0; i < num; i++) {
			int count=0;
			for (int j = 2; j < i; j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			
			if(count==0) {
				System.out.println(i);
			}
		}
	}
	
	@Test
	public void count1() {
		String s="aweexxxyyyyyy";
		char[] ch = s.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			hs.add(ch[i]);
		}
			
			for (Character character : hs) {
				int count=0;
				for (int j = 0; j < ch.length; j++) {
					if (character==ch[j]) {
						count++;
					}
				}
			System.out.println(character+"---"+count);
		}
	}
	
	@Test
	public void sort1() {
		char[] ch = {'c','s','w','a','v'};
		Arrays.sort(ch);
//		char[] ch1 = new char[ch.length];
//		int j=0;
//		char min = ch[0];
//		for (int i = 0; i < ch.length; i++) {
//			
//			if (ch[i]<min) {
//				min=ch[i];
//				
//			}
//			ch1[j]=min;
//			j++;
//		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	
	
	@Test
	public void rev() {
		String s = "i love man"; //n amev oli
		char[] ch1 = s.toCharArray();
		char[] ch2 = new char[ch1.length];
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i]==' ') {
				ch2[i]=ch1[i];
			}
		}
		int j=ch1.length-1;
		for (int i = 0; i < ch2.length; i++) {
			if(ch1[i]!=' ') {
				if (ch2[j]==' ') {
					j--;
				}
				ch2[j]=ch1[i];
				j--;
			}
		}
		System.out.println(ch2);
	}
	
	@Test
	public void rev1stCharInWord() {
		String[] str = {"var","car","dar","bumb"}; // Var Car Dar Bumb
		
		//1st way
		for (int i = 0; i < str.length; i++) {
			String sttr="";
//			 sttr= sttr+(char)(str[i].charAt(0)-32);
			 sttr=sttr+Character.toUpperCase(str[i].charAt(0));
			sttr=sttr+str[i].substring(1);
			System.out.print(sttr+" ");
		}
		System.out.println();
		
		//2nd way
		for (String string : str) {
			String s="";
			for (int i = 0; i < string.length(); i++) {
				if (i==0) {
					s=s+(char)(string.charAt(i)-32);
				}else {
					s=s+string.charAt(i);
				}
				
			}
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	@Test
	public void removingCharinSequence() {
		String s = "abcdefg"; 
		// abcdefg
		// bcdefg
		// bcdef
		// cdef
		// cde
		// de
		// d
//		String s1="";
//		System.out.println(s);
		for (int i = 0; i < s.length(); i++) {
			if(s.length()%2==1) {
				s=(s.substring(1, s.length()));
				System.out.println(s);
			}
//			
//			System.out.println(s);
			else if(s.length()%2==0) {
				s=(s.substring(1));
				System.out.println(s);
			}
		}
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
