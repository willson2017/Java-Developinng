package exe6;

public class Numbers {

	int count;
	int baseValue;
	Numbers(int baseValue, int count){
		this.count = count;
		this.baseValue = baseValue;
	}
	
	public void printNumbers_without_sync(){
		for(int i = 0; i < count; i++)
		{
			int result = baseValue + i;
			System.out.println(result);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	//public void printNumbers(){
	synchronized public void printNumbers_with_sync(){
		for(int i = 0; i < count; i++)
		{
			int result = baseValue + i;
			System.out.println(result);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
