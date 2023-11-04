package PatternPrograms;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Patterns {
 @Test
 public void pattern1() {
	// * * * * *
	// * * * * *
	// * * * * *
	// * * * * *
	// * * * * *
	 int n=5;
	 for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
 }
 
 @Test
 public void pattern2() {
	 // *
	 // * *
	 // * * *
	 // * * * *
	 // * * * * *
	 int n=5;
	 for (int i = 0; i < n; i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
 }
 
 @Test
 public void pattern3() {
	 // * * * * *
	 // * * * *
	 // * * *
	 // * *
	 // *
	 int n=5;
	 for(int i=n;i>0;i--) {
		 for(int j=i;j>0;j--) {
			 System.out.print("* ");
		 }
		 System.out.println();
	 }
 }
 
 @Test
 public void pattern4() {
	 //        *
	 //      * *
	 //    * * *
	 //  * * * *
	 //* * * * *
	 int n=5;
	 for(int i=1;i<=n;i++) {
		 for(int j=i;j<=n;j++) {
			 System.out.print("  ");
		 }
		 for(int j=1;j<=i;j++) {
			 System.out.print("* ");
		 }
		 System.out.println();
	 }
 }
 
 @Test
 public void pattern5() {
	 //* * * * *
	 //  * * * *
	 //    * * *
	 //      * *
	 //        *
	 int n=5;
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=i-1;j++) {
			 System.out.print("  ");
		 }
		 for(int j=i;j<=n;j++) {
			 System.out.print("* ");
		 }
		 System.out.println();
	 }
 }
 
 @Test
 public void pattern6() {
	 //    *
	 //   * *
	 //  * * *
	 // * * * *
	 //* * * * *
	 int n=5;
	 for(int i=1;i<=n;i++) {
		 for(int j=n-i;j>=1;j--) {
			 System.out.print(" ");
		 }
		 for(int j=i;j>=1;j--) {
			 System.out.print("* ");
		 }
		 System.out.println();
	 }
 }
 
 @Test
 public void pattern7() {
	 //* * * * *
	 // * * * *
	 //  * * * 
	 //   * *
	 //    *
	 int n=5;
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j>=i;j--) {
			 System.out.print(" ");
		 }
		 for(int j=n-i;j>=1;j--) {
			 System.out.print("* ");
		 }
		 System.out.println();
	 }
 }
 
 @Test
 public void pattern8() {
	 //1 1 1 1 1
	 //1 1 1 1 1
	 //1 1 1 1 1
	 //1 1 1 1 1
	 //1 1 1 1 1
	 int n=5;
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=n;j++) {
			 System.out.print("1 ");
		 }
		 System.out.println();
	 }
 }
 
 @Test
 public void pattern9() {
	 //1 1 1 1 1
	 //2 2 2 2 2
	 //3 3 3 3 3
	 //4 4 4 4 4
	 //5 5 5 5 5
	 int n=5;
	 for(int i=0;i<n;i++) {
		 for(int j=1;j<=n;j++) {
			 System.out.print(i+" "); 
		 }
		 System.out.println();
	 }
 }
	 @Test
	 public void pattern10() {
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		 int n=5;
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n;j++) {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 @Test
	 public void pattern11() {
		 //1
		 //1 2
		 //1 2 3
		 //1 2 3 4
		 //1 2 3 4 5
		 int n=5;
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 @Test
	 public void pattern12() {
		 //1 1 1 1 1 
		 //2 2 2 2
		 //3 3 3
		 //4 4 
		 //5
		 int n=5;
		 for(int i=1;i<=n;i++) {
			 for(int j=i;j<=n;j++) {
				 System.out.print(i+" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 @Test
	 public void pattern13() {
		 //        1
		 //      2 2
		 //    3 3 3
		 //  4 4 4 4
		 //5 5 5 5 5
		 
	 }
	 
	 @Test
	 public void pattern14() {
		 //1 2 3 4 5 
		 //  2 3 4 5
		 //    3 4 5
		 //      4 5 
		 //        5
		 int n=5;
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<i;j++) {
				 System.out.print(" ");
			 }
			 for(int j=i;j<=n;j++) {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 @Test
	 public void pattern15() {
		 // 5 4 3 2 1
		 // 4 3 2 1 
		 // 3 2 1 
		 // 2 1
		 // 1
		 int n=5;
		 for(int i=n;i>=1;i--) {
			 for(int j=i;j>=1;j--) {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 @Test
	 public void pattern16() {
		 // 1
		 // 2 2 
		 // 1 1 1
		 // 2 2 2 2
		 // 1 1 1 1 1
		 int n=5;
		 for(int i=1;i<=n;i++) {
			 for(int j=i;j>=1;j--) {
				 if(i%2==0) {
					 System.out.print(2+" "); 
				 }
				 else {
					 System.out.print(1+" ");
				 }
				
			 }
			 System.out.println();
		 }
	 }
	 
	 @Test
	 public void pattern17() {
		 //    1
		 //   2 2 
		 //  3 3 3
		 // 4 4 4 4
		 //5 5 5 5 5
		 int n=5;
		 for(int i=1;i<=n;i++) {
			 for(int j=n-i;j>=1;j--) {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++) {
				 System.out.print(i+" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 @Test
	 public void pattern18() {
		 //A B C D E
		 //F G H I J
		 //K L M N O
		 //P Q R S T
		 //U V W X Y
		 int n=5;
		 char ch='A';
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n;j++) {
				 
				 System.out.print(ch++ +" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 @Test
	 public void pattern19() {
		 //A B C D E
		 //A B C D E
		 //A B C D E
		 //A B C D E
		 //A B C D E
		 int n=5;
		 for(int i=1;i<=n;i++) {
			 char ch='A';
			 for(int j=1;j<=n;j++) {
				 System.out.print(ch++ +" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 @Test
	 public void pattern20() {
		 // * * * * *
		 //   * * *
		 //     *
		 int n=3;
		 for(int i=n;i>=1;i--) {
			 
			 for(int j=1;j<=n-i;j++)
			 {
				
			 System.out.print("  ");
		 }
			 for(int j=1;j<=2*i-1;j++) {
				 System.out.print("* ");
			 }
			 System.out.println();
	 }
	 }
 
	 
 
 
 
 
 
 
 
 
 
 
 
 
}
