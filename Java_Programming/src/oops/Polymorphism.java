package oops;

class A {
	void test() {
		System.out.println("override1");
	}
}

class B extends A {
	void test() {
		System.out.println("override");
	}
}

public class Polymorphism {


	public static void main(String[] args) {
		B obj=new B();
		obj.test();

	}

}
