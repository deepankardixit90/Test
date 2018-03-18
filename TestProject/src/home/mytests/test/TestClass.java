package home.mytests.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestClass {

	public TestClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
	    list.add("a");
	    list.add("b");
	    list.add("c");
	    Iterator i = list.listIterator();
	    list.remove("b");
	    while (i.hasNext()){
	      System.out.println(i.next());
	    }

	}

}
