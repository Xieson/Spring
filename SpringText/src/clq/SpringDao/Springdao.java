package clq.SpringDao;

import org.springframework.stereotype.Component;

//使用注解创建Springdao类对象springdao
@Component(value="springdao")
public class Springdao {
	public void add(){
		System.out.println("Springdao......");
	}
}
