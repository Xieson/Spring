package clq.SpringServlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringText {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("bean.xml");
		SpringServlet ap=(SpringServlet) app.getBean("springservlet");
		ap.find();

	}

}
