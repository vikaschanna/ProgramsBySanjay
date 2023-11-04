package NumberSeriesPrograms;

import org.testng.annotations.Test;

public class GivenNoIsPrimeOrNotTest {
	@Test
	public void primeNo() {
		int n=7;
//		System.out.println(1);
		int count=0;
			for(int j=2;j<n/2;j++) {
				if(n%j==0) {
					count++;
				}
				 
			}
			if (count==0) {
				System.out.println("it is a prime");
			}else {
				System.out.println("is not a prime");
			}
		
	}
	
	@Test
	public void primeNos(){
		int[] n= {1,9,3,5,2,6,7,4};
//		int j;
//		System.out.println(1);
		for (int i = 0; i < n.length; i++) {
			if(n[i]%2==0) {
				
			}
			else {
				for (int j = 0; j < n.length; j++) {
					if(n[i]%j==0) {
//						System.out.println();
						break;
					}
				}
				
			}
			
		}
	}
}
