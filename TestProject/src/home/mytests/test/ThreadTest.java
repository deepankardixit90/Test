package home.mytests.test;

public class ThreadTest extends Thread{
	
	int code = 9;
	
	public void run(){
		this.code=7;
	}

	public ThreadTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadTest t = new ThreadTest();
		t.start();
		Thread.sleep(1);
		for (int i =0; i<5; ++i){
			System.out.println(t.code);
		}
		
		ThreadTest t1 = null;
		t1.test();
	}
	
	public static void test(){
		System.out.println("test");
		
	}

}
