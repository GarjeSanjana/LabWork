package April11THU.example;
//Creating an Odd Thread
public class OddThread extends Thread {
	public void run()
	{
		int num=100;
		System.out.println("Odd numbers Between 1 to 100:");
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddThread odd=new OddThread();
		odd.start();
	}

}
