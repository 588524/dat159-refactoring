package PullUpProblem;

public class test {
	public static void main(String[] args) {
		BeforePullUp before = new BeforePullUp();
		System.out.print("Befor pull up the value of attribute a is:" );
		before.fun();
		AfterPullUp after = new AfterPullUp();
		System.out.print("After pull up the value of attribute a is:" );
		after.fun();
	}

}
