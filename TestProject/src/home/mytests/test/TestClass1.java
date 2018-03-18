package home.mytests.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestClass1 {

	public TestClass1() {}
		//B b = new B();
		//C c = new C();
		
		public List<? extends B> ring(){
			return new ArrayList<C>();
			
		}

}


 class A{}

 class B extends A{}

 class C extends B{}
 
 
