package home.vmware.practice;

public class ThreadExperiment1 {

	public ThreadExperiment1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread running....."+Thread.currentThread().getName());

			}
		});
		
		t1.setName("Thread1");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread running....."+Thread.currentThread().getName());

			}
		});
		t2.setName("Thread2");
		t2.start();
		
		System.out.println("Current Thread - "+Thread.currentThread().getName());

	}

}
