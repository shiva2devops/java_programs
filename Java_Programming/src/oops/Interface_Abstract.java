package oops;

interface s1 {
	int x = 100;

	void m1();
}

interface s2 {
	int y = 200;

	void m2();
}

public class Interface_Abstract implements s1, s2 {

	public static void main(String[] args) {
		Interface_Abstract obj = new Interface_Abstract();
		obj.m1();
		obj.m2();
		System.out.println(s1.x);
		System.out.println(s2.y);
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

}
