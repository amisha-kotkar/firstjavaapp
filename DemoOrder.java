
public class DemoOrder {
	public static void main(String []s)
	{
		Item i1=new Item(101,"pen",10);
		Item i2=new Item(102,"book",80);
		Item i3=new Item(103,"scale",50);
		Item i4=new Item(104,"pencil",70);
		Item i5=new Item(105,"Notebook",100);
		Item arr[]=new Item[5];
		arr[0]=i1;
		arr[1]=i2;
		arr[2]=i3;
		arr[3]=i4;
		arr[4]=i5;
		
		Order o1=new Order(1010,"Ram",arr);
		o1.display();
		
		Order o2=new Order(1010,"Ram",i4,i2,i5);
		o2.display();
		
		Order o3=new Order(1010,"Ram",i2,i3);
		o3.display();
	}
}
