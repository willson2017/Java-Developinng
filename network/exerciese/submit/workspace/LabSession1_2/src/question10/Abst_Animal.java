package question10;

public abstract class Abst_Animal {
	
	private String name;
	private int id;
	
	public Abst_Animal(String name, int id)
	{
		System.out.println("Constructing an Animal");
		this.name = name;
		this.id = id;
	}
	public String toString()
	{
		return ( "The animal's name is" + name + " " + ", and id is: " + id + " ");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
