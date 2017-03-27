package question10;

public class InterfaceAndAbstract {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.drink();
		System.out.println("Tiger has " + tiger.numberofLegs() + " legs");
		
		Abst_Animal abst_dog = new Dog("GoodBoy", 2);
		System.out.println(abst_dog.toString());
		
	}

}
