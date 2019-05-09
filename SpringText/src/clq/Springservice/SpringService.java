package clq.Springservice;

import org.springframework.stereotype.Service;

//使用注解创建SpringService类的对象springservice
@Service(value="springservice")
public class SpringService {
	public void flle(){
		System.out.println("Springservice.........");
	}
}
