package home.mytests.test;

public class CodilityRakutenTest {

	public CodilityRakutenTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int param = 3*Integer.MAX_VALUE/4;
		System.out.println("Input Value -"+param);
		System.out.println(calculate(param,param,10));
		System.out.println(calculate2(param,param,10));

	}
	
	private static int calculate(int A, int B, int N) {
		System.out.println("A = "+A);
		System.out.println("B = "+B);
	        int divisor = 1000000007;
	        int remainder = 0;
	        for (int i=0; i<=N; ++i){
	            if (i==0){
	                remainder = A;
	            }
	            else if (i == 1){
	                remainder = B;
	            }
	            else{
	                remainder = (A + B)%divisor;
	                A = B;
	                B = remainder;
	            }
	        }
	        
	        return remainder;
	     }
	
	private static int calculate2(int A, int B, int N) {
        int[] arr = new int[N+1];
        arr[0] = A%1000000007;
        arr[1] = B%1000000007;
        for (int i=2; i<=N; ++i){
            arr[i] = (arr[i-1]+arr[i-2])%1000000007;
        }
        
        return arr[N];
     }
	 }

