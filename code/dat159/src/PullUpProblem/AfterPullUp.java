package PullUpProblem;

class cc {
	public int a = 10;

	public void fun() {
		System.out.print(a + "\n");
	}

}


class bb extends cc {
	public int a=1;
}

public class AfterPullUp extends cc {
	public int a=2;
}