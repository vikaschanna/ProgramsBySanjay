package StringPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class StringProgramsEg {
	@Test
	public void reverseAString() {
		String s= "Bengaluru";

		//by using StringBuffer
		StringBuffer sBuf = new StringBuffer(s);
		System.out.print(sBuf.reverse());
		System.out.println();

		//by using String -3
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		System.out.println();

		//2
		char[] str = s.toCharArray();
		for (int i = str.length-1; i >=0 ; i--) {
			System.out.print(str[i]);
		}
		System.out.println();

		//1
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();

		//4
		char[] str1=s.toCharArray();
		int count=0;
		for (char c : str1) {
			count++;
		}
		for (int i = count-1; i >=0; i--) {
			System.out.print(str1[i]);
		}
		System.out.println();
	}

	@Test
	public void occurenceOfEachCharacterInStringUsingSET() {
		String s = "TestYantra";
		System.out.println(s);

		//to convert string into character array
		char[] ch = s.toCharArray();
		//1
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++) {
			lh.add(ch[i]);
		}
		for (Character chare : lh) {
			int temp = 0;
			for (int i = 0; i < ch.length; i++) {
				if(chare==ch[i]) {
					temp++;
				}
			}
			System.out.print(chare+"--> "+temp);
			System.out.println();
		}

		//to split the words
		//		String[] st=s.split(" ");
		//		for (int i = 0; i < st.length; i++) {
		//			System.out.println(st[i]);
		//		}
	}

	@Test
	public void occurenceOfEachCharacterInStringUsingMAP() {
		String s = "TestYantra";
		//		System.out.println(s);

		//to convert string into character array
		char[] ch = s.toCharArray();
		//1
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character, Object>();
		for(int i=0;i<ch.length;i++) {
			map.put(ch[i], i);
		}
		for (Entry<Character, Object> chare:map.entrySet()) {
			int temp = 0;
			for (int i = 0; i < ch.length; i++) {
				if(chare.getKey()==ch[i]) {
					temp++;
				}
			}
			System.out.print(chare.getKey()+" --> "+temp);
			System.out.println();
		}
	}

	@Test
	public void occurenceOfEachCharacherInString() {
		String s = "TestYantra";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			for (int j = 0; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			System.out.println(ch[i]+" is occured "+count+" times");
		}
	}

	@Test
	public void removeDuplicatesInStringUsingSET() {
		String s = "TestYantra";
		char[] ch = s.toCharArray();

		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			lh.add(ch[i]);
		}
		for (Character character : lh) {
			System.out.print(character+" ");
		}
		System.out.println();
	}

	@Test
	public void removeDuplicatesInStringUsingMAP() {
		String s = "TestYantra";
		char[] ch = s.toLowerCase().toCharArray();

		LinkedHashMap<Character, Object> lh = new LinkedHashMap<Character, Object>();
		for (int i = 0; i < ch.length; i++) {
			lh.put(ch[i], i);
		}
		for (Map.Entry<Character, Object> entry : lh.entrySet()) {
			Character key = entry.getKey();
			
		
//		for (Character character : lh) {
//			System.out.print(character+" ");
//		}
		System.out.print(key);
		}
		System.out.println();
	}

	@Test
	public void countTheNoOfDuplicatesInString() {
		String s = "TestYantra";
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			lh.add(ch[i]);
		}
		for (Character character : lh) {

			int count = 0;
			for (int j = 0; j < ch.length; j++) {

				if(character==ch[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.print(character+" count --> "+count);
				System.out.println();
			}

		}
		System.out.println();
	}

	@Test
	public void positionOfEachCharacterInString() {
		String s = "TestYantra";
		char ch[] = s.toCharArray();
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			lh.add(ch[i]);
		}
		for (Character c : lh) {
			for (int i = 0; i < ch.length; i++) {
				if(c==ch[i]) {
					System.out.println("the position of "+c+" is "+(i+1));
					break;
				}
			}
		}
	}

	@Test
	public void occurenceOfEachWordInString() {
		String s = "I am from am from TestYantra";
		String[] st = s.split(" ");
		//		for (String string : st) {
		//			System.out.println(string);
		//		}
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		for (int i = 0; i < st.length; i++) {
			lh.add(st[i]);
		}
		for (String str : lh) {
			int count = 0;
			for (int j = 0; j < st.length; j++) {
				if(st[j].equals(str)) {
					count++;
					//					System.out.println(count);
				}
			}
			System.out.println("The word "+str+" is present "+count+" times");
		}
		System.out.println();
	}

	@Test
	public void removeDuplicateWordsInString() {
		String s = "I am from am from TestYantra";
		String[] st = s.split(" ");
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		for (int i = 0; i < st.length; i++) {
			lh.add(st[i]);
		}
		for (String string : lh) {
			System.out.println(string);
		}
		System.out.println();
	}

	@Test
	public void countTheNoOfDuplicateWordsInString() {
		String s = "I am from am from TestYantra 	1231 ";
		//		String s = a.toLowerCase();
		String[] st = s.split(" ");
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		for (int i = 0; i < st.length; i++) {
			lh.add(st[i]);
		}
		for (String string : lh) {
			int count=0;
			for (int i = 0; i < st.length; i++) {
				if(st[i].equals(string)) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(string+" ---> "+count);
				System.out.println();
			}

		}
	}

	@Test
	public void positionOfEachWordInString() {
		String s = "I am from am from TestYantra";
		String[] st = s.split(" ");
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		for (int i = 0; i < st.length; i++) {
			lh.add(st[i]);
		}
		for (String c : lh) {
			for (int i = 0; i < st.length; i++) {
				if(st[i].equals(c)) {
					System.out.println("the position of "+c+" is "+(i+1));
					break;
				}
			}
		}
	}

	@Test
	public void occurenceOfCharacherInString1() {
		String s = "TestYantra 123";
		Map<Character, Integer> h = new LinkedHashMap<Character, Integer>();
		for (char c: s.toCharArray()) {
			if(Character.isLetter(c)) {
				h.put(c, h.getOrDefault(c, 0)+1);
			}
		}

		for(Entry<Character, Integer> e :h.entrySet()) {
			if(e.getValue()>1)
				System.out.println(e.getKey()+" --> "+e.getValue());
		}
	}

	//	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void stringPalendrome() {
		String s="kanak";
		String rev ="";
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.println("it is a palendrome");
		}else {
			System.out.println("it is not a palendrome");
		}

		//2 using stringBuffer
		//		StringBuilder s1 = new StringBuilder(s);
		//		StringBuilder s2 = s1.reverse();
		//		System.out.println(s2);
		//		if(s.equals(s2)) {
		//			System.out.println("palendrome");
		//		}
		//		else {
		//			System.out.println("not palendrome");
		//		}
	}

	@Test
	public void printPositionOfEachCharacterInReverse() {
		String s = "Tester";//r=6 e=5 t=4
		//		int position=0;
		//		char[] ch = s.toCharArray();
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		for (int i =s.length()-1; i >=0; i--) {
			lh.add(s.charAt(i));
		}
		System.out.println(lh);

		for (Character ch : lh) {
			for(int j=0;j<=s.length()-1;j++) {
				//					String str=s.charAt(j);
				if(ch==s.charAt(j)) {
					System.out.println(ch+"-->"+(j+1));
				}
			}
		}


	}

	@Test
	public void reverseAGivenString() {
		String s = "I am from TestYantra";//TestYantra from am I
		String[] st = s.split(" ");
		for(int i=st.length-1;i>=0;i--) {
			System.out.print(st[i]+" ");
		}
		System.out.println();
	}

	@Test
	public void reverseTheWordsInString() {
		String s ="I am from TestYantra";//I ma morf artnaYtseT
		String[] st = s.split(" ");
		for(int i=0;i<st.length;i++) {
			String str = st[i];
			//			System.out.println(str);
			for (int j = str.length()-1; j >=0 ; j--) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
	}

	@Test
	public void swap1stAndLastWordsInString() {
		String s = "I am from TestYantra";//TestYantra am from I
		String[] st = s.split(" ");
		//		String s1 = st[0],s2=st[st.length-1];
		String temp = st[0];
		//			st[0]=s2;
		//			st[st.length-1]=s1;

		st[0]= st[st.length-1];
		st[st.length-1]=temp;

		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i]+" ");
		}
		System.out.println();
	}

	@Test
	public void countNoOfVowelsInAStringWithDuplicates() {
		String s = "India";
		String s1 = s.toLowerCase();
		System.out.println(s1);
		int count=0;
		for (int j = 0; j < s1.length(); j++) {

			if(s1.charAt(j)=='a' ||s1.charAt(j)=='e'|| s1.charAt(j)=='i' ||s1.charAt(j)=='o' || s1.charAt(j)=='u') {
				count++;
				System.out.print(s.charAt(j)+" ");
			}

		}
		System.out.println();
		System.out.println("Total count is "+count);

	}

	@Test
	public void countNoOfVowelsInAStringWithoutDuplicatesUsingSET() {
		String s = "IndianPolice";
		String s1 = s.toLowerCase();
		char[] ch = s1.toCharArray();
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			lh.add(ch[i]);
		}
		int count=0;
		for (Character cha : lh) {
			if(cha=='a' || cha=='e' || cha=='i' || cha=='o' || cha=='u') {
				count++;
				System.out.print(cha+" ");
			}
		}
		System.out.println();
		System.out.println("Total count without duplicates is "+count);
	}

	@Test
	public void countNoOfVowelsInAStringWithoutDuplicatesUsingMAP() {
		String s = "India";
		String s1 = s.toLowerCase();
		char[] ch = s1.toCharArray();
		LinkedHashMap<Character, Object> lh = new LinkedHashMap<Character, Object>();
		for (int i = 0; i < ch.length; i++) {
			lh.put(ch[i], i);
		}
		int count=0;
		for (Entry<Character, Object> cha : lh.entrySet()) {
			if(cha.getKey()=='a' || cha.getKey()=='e' || cha.getKey()=='i' || cha.getKey()=='o' || cha.getKey()=='u') {
				count++;
				System.out.print(cha.getKey()+" ");
			}
		}
		System.out.println();
		System.out.println("Total count without duplicates is "+count);
		
	}

	@Test
	public void segregateAlphabetsNumbersAndSpclCharFromAGivenString1() {
		String s="a1b2%c@3"; //abc 123 %@
		char[] ch = s.toCharArray();
		String cap = "",small = "",spcl="";
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=97 && ch[i]<=122 || ch[i]>=65 && ch[i]<=90) {
				cap=cap+ch[i];
			}
			else if(ch[i]>=48 && ch[i]<=57) {
				small = small+ch[i];
			}
			else {
				spcl=spcl+ch[i];
			}

		}
		String st = cap+" "+small+" "+spcl;
		System.out.println(st);
	}

	@Test
	public void segregateAlphabetsNumbersAndSpclCharFromAGivenString2() {
		String s="a1b2%c@3"; //abc 123 %@
		String alpha = "";
		String num="";
		String spcl = "";
		for (int i = 0; i < s.length(); i++) {
			char st = s.charAt(i);
			if(st>='a'&& st<='z' || st>='A' && st<='Z') {
				alpha=alpha+st;
			}
			else if(st>='0' && st<='9') {
				num=num+st;
			}
			else {
				spcl=spcl+st;
			}
		}
		String str = alpha+" "+num+" "+spcl;
		System.out.println(str);
	}

	@Test
	public void segregateAlphabetsNumbersAndSpclCharFromAGivenString3() {
		String s="a1b2%c@3"; //abc 123 %@
		String alpha = "";
		String num="";
		String spcl = "";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(Character.isLetter(ch)){
				alpha=alpha+ch;
			}
			else if(Character.isDigit(ch)) {
				num=num+ch;
			}
			else {
				spcl=spcl+ch;
			}
		}
		System.out.println(alpha+" "+num+" "+spcl);
	}

	@Test
	public void addingNumbersInString() {
		String s = "1he2m4";
		int num=0;
		char[] ch=s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if(Character.isDigit(ch[i])) {
				num=num+ch[i]-48;
			}
		}
		System.out.println(num);
	}

	@Test
	public void addingNumbersInString2() {
		String s = "1he2m4";
		int num=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int n=s.charAt(i)-48;
				num=num+n;
			}
		}
		System.out.println(num);
	}

	@Test
	public void sumOf2DigitsInString1()
	{
		String s="12a11b30c17d4e3"; // 12+11+3=26
		int num=0;
		try {
			for (int i = 0; i < s.length(); i++) {
				if((s.charAt(i)>='0' && s.charAt(i)<='9') && (s.charAt(i+1)>='0' && s.charAt(i+1)<='9')) {
					String st = s.charAt(i)+""+s.charAt(i+1);
					Integer inte = Integer.valueOf(st);
					num=num+inte;
					i++;
				}
				else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
					int num2 = s.charAt(i)-48;
					num=num+num2;
				}
			}
		} 
		catch (Exception e) {
			System.out.println(num);
		}
		
		
		}
	
	@Test
	public void sumOf2DigitsInString2()
	{
		String s="12a110b3"; // 12+11+3=26
		int sum=0;
		int tsum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int n=s.charAt(i)-48;
				tsum=tsum*10+n;
			}
			else {
				sum=sum+tsum;
				tsum=0;
			}
		}
		sum=sum+tsum;
		System.out.println(sum);
		
	}

	@Test
	public void printMinLengthValuesInString() {
		String[] s = {"12","1234","12345","4","1434234"}; // 12 45
//		HashSet<String> lh = new HashSet<String>();
//		for (int i = 0; i < s.length; i++) {
//			lh.add(s[i]);
//		}
//		System.out.println(lh);
//		
//			
//		for (String string : lh) {
//			for (int i = 0; i < s.length; i++) {
////			int len = string.length();
////			System.out.println(len);
//			if(s[i].length()<=string.length()) {
//				if(string.length()==s[i].length()) {
//					System.out.println(string);
//				}
//				
//			}
//		}
//		System.out.println();
//		}
		String min_len = s[0];
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()<min_len.length()) {
				min_len=s[i];
			}
			
		}
		for (int i = 0; i < s.length; i++) {
			if(min_len.length()==s[i].length()) {
				System.out.print(s[i]+" ");
			}
		}
		System.out.println();
	}
	
	@Test
	public void printMaxLengthValuesInString() {
		String[] s = {"ba","baa","badava","ra","rascal"}; // 1434234
		String max_len = s[0];
		for (int i = 0; i < s.length; i++) {
			if(max_len.length()<s[i].length()) {
				max_len=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(max_len.length()==s[i].length()) {
				System.out.print(s[i]+" ");
			}
		}
		System.out.println();
	}

	@Test
	public void stringPalindrome() {
		boolean flag=false;
		String a="gadag";
		a=a.toLowerCase();
		int left = 0;
		int right = a.length()-1;
		
		while(left<right) {
			if(a.charAt(left)!=a.charAt(right)) {
				System.out.println(a+" is not a palindrome");
				break;
			}
			left++;
			right--;
			flag=true;
			
			
		}
		if(flag) {
			System.out.println(a+" is a palendrome");
		}
	}
	
		@Test
		public void mergingStringInMiddle() {
		String s ="javajavaseleniumjava";
//		int index = s.indexOf("selenium");
//		System.out.println(index);
		System.out.println(s.replace("selenium", "java"));
		
		
		}








}

