// using multithreading
class A extends Thread{
	public void run()
	{
	for(int i=1;i<5;i++)
	{
	System.out.println("\t From Thread: i = " + i);
	}
	System.out.println("Exit form A");
	}
}


class B extends Thread{
	public void run()
	{
		for(int j=1;j<=10;j++)
		{
			System.out.println("\t thread B : j = " + j);
		}
		System.out.println("Exit form B");
	}
} 

class C extends Thread{
        public void run(){
	for(int k=1;k<5;k++)
	{
	System.out.println("\t From Thread C : k = " + k);
	}
	System.out.println("Exit form C");
	}
}


class ThreadTest{
	public static void main(String arg[]){
		new A().start();
		new B().start();
		new C().start();
	}
}