package inject_map_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestShop {

public static void main(String[] args) {
		
		ApplicationContext appCont=new ClassPathXmlApplicationContext("my_config.xml");
	    Shop shop=(Shop)appCont.getBean("myShop");
		
	    shop.display();
	}
}
