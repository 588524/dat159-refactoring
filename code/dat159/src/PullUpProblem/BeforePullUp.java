package PullUpProblem;

class aaa {
	public int a=10;

	
}

class bbb extends aaa {
	public int a=1;
	public void fun() {
		System.out.print(a);
	}
}

public class BeforePullUp extends aaa {
	public int a=2;
	public void fun() {
		System.out.print(a + "\n");
	}
}