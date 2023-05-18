
public class Item {
	private int ino;
	private String name;
	private double price;
	public double getPrice()
	{
		return price;
	}
	public void setPrice(int c)
	{
		price=c;
	}
	public Item(int ino,String name,double price)
	{
		this.ino=ino;
		this.name=name;
		this.price=price;
	}
	public void display()
	{
		System.out.println("id no is: "+ino);
		System.out.println("item name is: "+name);
		System.out.println("item price is: "+price);
	}
}
