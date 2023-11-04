package ArrayPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class ArrayProgramsTest {
	@Test
	public void swap2NosUsing3rdVariable() {
		int a=10,b=20;
		
		System.out.println("before swapping--> a= "+a+ " and b= "+b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("after swapping--> a= "+a+" and b= "+b);
		
	}
	
	@Test
	public void swap2NosWithoutUsing3rdVariable() {
		int a=10,b=20;
		System.out.println("before swapping--> a= "+a+ " and b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping--> a= "+a+" and b= "+b);
	}
	
	@Test
	public void sortAnArrayInAscendingOrderUsingBubbleSort() {
		int[] a= {5,3,0,1,4};
		//using collections
//		HashSet<Integer> l = new HashSet<Integer>() ;
//		for(int i=0;i<l.kength;
//		
//		System.out.println(l);
		
		//using bubbleSort
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		
	}
		@Test
		public void sortAnArrayInDescendingOrderUsingBubbleSort() {
			int[] a= {5,3,0,1,4};
			for(int i=0;i<a.length;i++) {
				for(int j=i;j<a.length;j++) {
					if(a[i]<a[j]) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		
	@Test
	public void find1stMinNoInArray() {
		int[] a= {5,3,0,1,4};
		int min =a[0];
		for(int i=1;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
			if(a[i]<min) {
				min=a[i];
			}
		}
//		System.out.println("1st min value is--> "+a[0]);
			System.out.println("1st min value is--> "+min);
		
		System.out.println();
	}
	
	@Test
	public void find2ndMinNoInArray() {
		int[] a= {2,3,0,1,4,5};
		int min =a[0],j=0;;
		int b[] = new int [a.length];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>min) {
				for(j=i; j<b.length; ) {
					b[j]=a[i];
					
					
					break;
			}
				
		}
			System.out.print(b[j]+"");
		}
		
		int mn=b[0];
		System.out.println(mn);
		for(int i=0;i<b.length;i++) {
			if(b[i]<mn) {
				mn=b[i];
			}
		}
		System.out.println(mn);
		//System.out.println("2nd min number is--> "+b[1]);
		System.out.println();
	}
	
	@Test 
	public void find1stAnd2ndMinNoInArrayWithoutUsingBubbleSort() {
		int[] a= {2,3,0,1,4,5};
		int fmin = a[0],smin = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<=fmin) {
				if(a[i]!=fmin) {
					smin=fmin;
				}
				fmin=a[i];
			}
			else if(smin==fmin || smin>a[i]) {
				smin=a[i];
			}
		}
		System.out.println("the 1st min number in an array is --> "+fmin);
		System.out.println("the 2nd min number in an array is --> "+smin);
	}
	
	@Test
	public void find1stMaxNoInArray() {
		int[] a= {5,3,0,1,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println("1st Max number is--> "+a[0]);
		System.out.println();
	}
	
	@Test
	public void find2ndMaxNoInArray() {
		int[] a= {5,3,0,1,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("2nd Max Number is--> "+a[1]);
		System.out.println();
	}
	
	@Test
	public void find1stAnd2ndMaxNosInAnArrayWithoutUsingBubbleSort() {
		int[] a = {7,2,1,0,5};
		int fmax = a[0],smax = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>=fmax) {
				if(a[i]!=fmax) {
					smax=fmax;
				}
				fmax=a[i];
			}
			else if(smax==fmax || smax<a[i]) {
				smax=a[i];
			}
		}
		System.out.println("The 1st max no in an array is --> "+fmax);
		System.out.println("The 2nd max no in an array is --> "+smax);
	}
	
	@Test
	public void sumOfFirst3MinNoInArray() {
		int[] a= {5,3,0,1,4};
		int sum=0;
//		int var[] = {};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		
		}
		for(int i=0;i<3;i++) {
			sum = sum+a[i];
		}
		System.out.println("sum of 1st 3 min nos is --> "+sum);
		System.out.println();
	}
	
	@Test
	public void sumOfFirst3MaxNoInArray() {
		int[] a= {5,3,0,1,4};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int i=0;i<3;i++) {
			sum = sum+a[i];
		}
		System.out.println("sum of 1st 3 max nos is --> "+sum);
		System.out.println();
	}
	
	
	@Test
	public void mulOfFirst3MinNoInArray() {
		int[] a= {5,3,0,1,4};
		int sum = 1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int i=0;i<3;i++) {
			sum = sum*a[i];
		}
		System.out.println("mul of 1st 3 nmin nos is --> "+sum);
		System.out.println();
	}
	
	@Test
	public void mulOfFirst3MaxNoInArray() {
		int[] a= {5,3,0,1,4};
		int sum = 1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int i=0;i<3;i++) {
			sum = sum*a[i];
		}
		System.out.println("mul of 1st 3 max nos is--> "+sum);
		System.out.println();
	}
	
	@Test
	public void sumOf2NosShouldBe11InAnArray() {
		int[] a= {8,4,3,9,2,7,5,6,4,6};
//		int s1=a[0],s2=a[1];
		for(int i=0;i<a.length;i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]+a[j]==11) {
					System.out.println("the combination is --> "+a[i]+" and "+a[j]);
				}
			}
		}
	}
	
	
	@Test
	public void find1stMaxAnd1stMinInAnArray() {
		int[] a = {5,4,7,6,1,0,3};
		int fmax=a[0],fmin=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>=fmax) {
				if(a[i]!=fmax) {
					fmin=fmax;
				}
				fmax=a[i];
			}
			else if(fmax==fmin || fmin>a[i]) {
				fmin=a[i];
			}
		}
		System.out.println("1st max "+fmax);
		System.out.println("1st min "+fmin);
	}
	
	@Test
	public void min() {
		int a[] = {2,3,1,8,7,0,6};
		int fmin = a[1],smin = a[0];
		for(int i=0;i<a.length;) {
			if(a[i]<fmin) {
				
			}
		}
	}
	
	@Test
	public void additionOf2Arrays() {
		int[] a= {4,3,6,1,0},b= {2,6,8,1,7};
		int c[]= {a.length+b.length};
		for(int i=0;i<c.length;i++) {
			if(i/2==0) {
			for(int j=0;j<a.length;j++) {
				c[i]=a[j];
			}
			}
			else if(i/2!=0) {
				for(int j=0;j<b.length;j++) {
					c[i]=b[j];
				}
			}
				
			System.out.print(c[i]);
			
		}
//		System.out.print(c+" ");
		System.out.println();
		
	}
	
	@Test
	public void add() {
		int[] a= {4,3,6,1,0},b= {2,6,8,1};  //6 9 14 2 0
		int length = a.length;//5
		if(a.length<b.length) //5<4 f
		{
			length = b.length;
		}
		for(int i=0;i<length;i++) 
			// 0<5 t
			// 1<5 t
			// 2<5 t
			// 3<5 t
			// 4<5 t
			// 5<5 f terminate
		{
			try {
				a[i]=a[i]+b[i];
				// a[0]=4+2=6
				// a[1]=3+6=9
				// a[2]=6+8=14
				// a[3]=1+1=2
				// a[4]=0+ArrayIndexOutOfBoundException
				System.out.print(a[i]+" ");
				// 6 9 14 2
			} catch (Exception e) {
				if(a.length>b.length)//5>4
				{
					System.out.println(a[i]); //0
				}
				else {
					System.out.println(b[i]);
				}
			}
			
		}
		System.out.println();
	}
	
	@Test
	public void appending0sAtLast() {
		int[] a= {5,0,4,0,0,9}; // 5 4 9 0 0 0 
		int[] b= new int[a.length];
		int m=0,n=a.length-1;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				b[m]=a[i];
				m++;
			}
			else {
				b[n]=a[i];
				n--;
			}
			
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}
	
	@Test
	public void removeDuplicatesInAnArrayUsingCollections() {
		int a[]= {2,3,1,4,1,3,5,2};
//		TreeSet<Object> l = new TreeSet<Object>(); //remove duplicates and store in ascending order
		HashSet<Object> h = new HashSet<Object>(); //remove duplicates and store in ascending order
//		LinkedHashSet<Object> lh = new LinkedHashSet<Object>(); //remove dulicates and insertion order maintained
		for(int i=0;i<a.length;i++) {
			h.add(a[i]);
		}
		
		//print using for-each loop
		for (Object obj : h) {
			System.out.print(obj+", ");
		}
		System.out.println();
//		System.out.println(h);
	}
	
	@Test
	public void removeDuplicatesInAnArrayUsingMAP() {
		int a[] = {2,3,1,4,1,3,5,2};
		LinkedHashMap<Object, Object> t = new LinkedHashMap<Object, Object>(); //maintain insertion oder and remove duplicates
//		HashMap<Object, Object>
		for (int i : a) {
			t.put(i,null);
		}
		for (Entry<Object, Object> i : t.entrySet()) {
			System.out.print(i.getKey()+" ");
		}
		System.out.println();
	}
	
	@Test
	public void countHowManyTimesDuplicateNosIsRepeatingInAnArray() {
		int[] a = {2,3,1,2,4,1,3,5,2,010,012,013,012,014,015,011};
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			
				System.out.println("the number "+a[i]+" is duplicated "+count+" times");
			
		}
	}
		@Test
		public void countHowManyTimesDuplicateNosIsRepeatingInAnArrayUsingSet() {
			int[] a = {2,3,1,2,4,1,3,5,2};
			LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
			for (int i = 0; i < a.length; i++) {
				lh.add(a[i]); // 2 3 1 4 5
			}
			
			for (Integer in : lh) {
				int count = 0;
				for(int i=0;i<a.length;i++) {
					if(in==a[i]) {
						count++;
					}
				}
				System.out.println("The number "+in+" is duplicated "+count+" times");
			}
		}
		
	@Test
	public void countHowManyTimesDuplicateNosIsRepeatingInAnArrayUsingMap() {
		int[] a = {2,3,1,2,4,1,3,5,2};
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			h.put(a[i], i);
		}
		for (Entry<Integer, Integer> i : h.entrySet()) {
			System.out.println(i.getKey());
		}
		
		for (Entry<Integer, Integer> i : h.entrySet()) {
			Integer key = i.getKey();
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(key==a[j]) {
					count++;
				}
			}
			System.out.println("The number "+key+" is duplicated "+count+" times");
			
		}
	}
	
	@Test
	public void printDuplicatesInAnArrayUsingCollections() {
		Object[] a = {2,3,1,2,4,1,3,5,2,10,10};
		// 2 = 3
		// 3 = 2
		// 1 = 2
		LinkedHashSet<Object> lh = new LinkedHashSet<Object>();
		for (int i = 0; i < a.length; i++) {
			lh.add(a[i]); // 2 3 1 4 5
		}
		
		for (Object in : lh) {
			int count = 0;
			for(int i=0;i<a.length;i++) {
				if(in==a[i]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println("The number "+in+" is duplicated "+count+" times");
		}
	}
	}
	
	@Test
	public void positionOfEachNoInAnArrayWithoutDuplicates() {
		int[] a = {2,3,1,2,4,1,3,5,2};
		//2 = 1
		//3 = 2
		//1 = 3
		//4 = 5
		//5 = 8
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			lh.add(a[i]); // 2 3 1 4 5
		}
		
		for (Integer in : lh) {
			for(int i=0;i<a.length;i++) {
				if(in==a[i]) {
					System.out.println("The number "+in+" is present "+(i+1)+" times");
					break;
				}
			}
		}
	
	}
	
	@Test
	public void positionOfEachNoInAnArrayWithoutDuplicatesUsingMap() {
		int[] a = {2,3,1,2,4,1,3,5,2};
		//2=1
		//3=2
		//1=3
		//4=5
		//5=8
		LinkedHashMap<Integer, Object> lh = new LinkedHashMap<Integer, Object>();
		for(int i = 0; i<a.length; i++) {
			lh.put(a[i], i);
			
		}
		for (Entry<Integer, Object> in : lh.entrySet()) {
			System.out.println(in.getKey());  // 2 3 1 4 5
		}
		for (Entry<Integer, Object> in : lh.entrySet()) {
			for (int i = 0; i < a.length; i++) {
				if(in.getKey()==a[i]) {
					System.out.println("The number "+in.getKey()+" is present in "+(i+1)+" position");
					break;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
}
