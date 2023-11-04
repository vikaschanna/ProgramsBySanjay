package NumberSeriesPrograms;

import org.testng.annotations.Test;

public class factorialTest {
	@Test
	public void factorial() {
		int n = 5;
		int temp=1;
		for (int i = 1; i <= n; i++) {
			temp=temp*i;
		}
		System.out.println(temp);
	}
}
