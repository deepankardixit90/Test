package home.mytests.test;

import java.util.Scanner;

public class Adder extends Arithmatic {

	public Adder() {
		super();
	}

	@Override
	public int add(int a, int b) {
		if (a > 0 && a <100 && b > 0 && b < 100)
		return a+b;
		else throw new IllegalArgumentException();
	}

}
