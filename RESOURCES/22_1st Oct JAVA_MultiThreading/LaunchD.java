
class Ineuron implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<4;i++)
			{
				System.out.println("Java is best to understant coding");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



public class LaunchD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread t=Thread.currentThread();
		
		System.out.println(t.isDaemon());
		//t.setDaemon(true);
		//System.out.println(t.isDaemon());
		
		Ineuron i=new Ineuron();
		Thread t1=new Thread(i);
		System.out.println(t1.isDaemon());
		t1.start();
		t1.setDaemon(true);
		
		System.out.println(t1.isDaemon());
		

	}

}
