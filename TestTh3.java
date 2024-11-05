class Th1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("2 * "+ i +" = "+2*i);
	}
}
class Th2 implements Runnable
{
	public void run()
	{
		for(int j=1;j<=10;j++)
			System.out.println("3 * "+ j +" = "+3*j);
	}
}
class TestTh3
{
	public static void main(String args[])
	{
		Th1 ob1 = new Th1();
		Th2 ob2 = new Th2();
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		t1.start();
		t2.start();
	}
}