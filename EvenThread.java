//Q.3)Create two threads to print odd numbers and even numbers from 1 to 100?
package April11THU.example;
//Creating an Even Thread
public class EvenThread extends Thread{
	public void run()
	{
		int num=100;
		System.out.println("Even numbers Between 1 to 100:");
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenThread even=new EvenThread();
		even.start();
	}

}
