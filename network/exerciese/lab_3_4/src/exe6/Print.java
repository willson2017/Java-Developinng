package exe6;

class PrintThread_without_sync extends Thread {
	Numbers num;
	
	PrintThread_without_sync(Numbers num) {
		this.num = num;
	}
	public void run()
	{	
		num.printNumbers_without_sync();
	}
}

class PrintThread_with_sync extends Thread {
	Numbers num;
	
	PrintThread_with_sync(Numbers num) {
		this.num = num;
	}
	public void run()
	{	
		num.printNumbers_with_sync();
	}
}
public class Print {
	public static void main(String[] args) {
		Numbers num = new Numbers(10, 10);	
		
		//with out synchronization
		System.out.println("#####without synchronization#####");
		PrintThread_without_sync thread1 = new PrintThread_without_sync(num);
		PrintThread_without_sync thread2 = new PrintThread_without_sync(num);
		thread1.start();		
		thread2.start();
		
		//with synchronization
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n#####with synchronization#####");
		PrintThread_with_sync thread3 = new PrintThread_with_sync(num);
		PrintThread_with_sync thread4 = new PrintThread_with_sync(num);
		thread3.start();
		thread4.start();
		
	}
}
