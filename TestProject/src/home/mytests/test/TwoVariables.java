package home.mytests.test;

public class TwoVariables {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int x = 7;
//		int y = x;
//		x = 2;
//		System.out.println(x + ", " + y);
//
//	}

	
	
	  private int a;
	  public double b;
	  
	  public TwoVariables(int first, double second)
	  {
	    this.a = first;
	    this.b = second;
	  }
	  public static void main(String[] args)
	  {
		  TwoVariables c1 = new TwoVariables(10, 20.5);
		  TwoVariables c2 = new TwoVariables(10, 31.5);
	    c2 = c1;   
	    c1.a = 2;
	    System.out.println(c2.a);
	  }
}
