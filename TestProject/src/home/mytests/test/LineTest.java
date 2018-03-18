package home.mytests.test;

import java.math.BigInteger;

public class LineTest {

	public LineTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println(calculateTotalNumberOfWays(610));

	}
	
	private static BigInteger calculateTotalNumberOfWays(int n) {
		BigInteger[] arr = new BigInteger[n+7];
		
		//total number of ways to get 1-6 on rolling dice
		arr[0] = new BigInteger("1");
		arr[1] = new BigInteger("1");
		arr[2] = new BigInteger("2");
		arr[3] = new BigInteger("4");
		arr[4] = new BigInteger("8");
		arr[5] = new BigInteger("16");
		arr[6] = new BigInteger("32");
		
		if (n>6){
		for (int i=7; i<=n; ++i ){
			
			arr[i] = arr[i-6].add(arr[i-5]).add(arr[i-4]).add(arr[i-3]).add(arr[i-2]).add(arr[i-1]);
		}
		}
		return arr[n];
	}

}
