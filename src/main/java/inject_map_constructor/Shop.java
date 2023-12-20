package inject_map_constructor;

import java.util.Map;

public class Shop {

	private String name;
	private Map<String,Double> items;
	public Shop(String name, Map<String, Double> items) {
		super();
		this.name = name;
		this.items = items;
	}
	
	public void display()
	{
		System.out.println("shop name: "+name);
		System.out.println("-------fruits list-----------");
		
		for(Map.Entry<String,Double> item:items.entrySet())
		{
			System.out.println(item.getKey()+" --> "+item.getValue());
		}
	}
}
