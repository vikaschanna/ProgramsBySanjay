package NumberSeriesPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class fibonacciTest {
	@Test
	public void fibonacci() {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int a=0,b=1,temp;
		for (int i = 0; i < s; i++) {
			System.out.println(a);
			temp=a+b;
			a=b;
			b=temp;
					
		}
	}
}
