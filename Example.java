package threads;

public class Example implements Runnable {
	public static int x=20;
	 public static void main(String args[])
	{
		Example obj=new Example();
		Thread ob1=new Thread();
		ob1.start();
		System.out.println(x);
		x=x+10;
		System.out.println(x);
	}
public void run() {
	int y=20;
	System.out.println(y);
	System.out.println(x);
}

}
