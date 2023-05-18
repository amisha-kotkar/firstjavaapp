
public class Order {
	private int id;
	private String name;
	private Item arr[];
	public Order()
	{
		id=00;
		name="NA";
	}
	public Order(int id,String name,Item a[])
	{
		this.id=id;
		this.name=name;
		arr=a;
	}
	public Order(int id,String name,Item i,Item j)
	{
		this.id=id;
		this.name=name;
		arr=new Item[2];
		arr[0]=i;
		arr[1]=j;
	}
	public Order(int id,String name,Item i,Item j,Item z)
	{
		this.id=id;
		this.name=name;
		arr=new Item[3];
		arr[0]=i;
		arr[1]=j;
		arr[2]=z;
	}
	public void display()
	{
		System.out.println("id is: "+id);
		System.out.println("name is: "+name);
		for(int i=0;i<arr.length;i++)
		{
			arr[i].display();
		}	
	}
	public Item maxPrice()
	{
		Item temp=arr[0];
		double max=arr[0].getPrice();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getPrice()>max)
			{
				max=arr[i].getPrice();
				temp=arr[i];
			}
		}
		
		return temp;
	}
}
