import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.spring.service.ServiceMetier;

public class Main {
	public static void main(String[] args){
		ApplicationContext bf = new ClassPathXmlApplicationContext(new String[]{"applicationContext_with_aop.xml"});
		
		ServiceMetier sm = (ServiceMetier) bf.getBean("service1");
		
		sm.ajouterAdherent();
	}
}
