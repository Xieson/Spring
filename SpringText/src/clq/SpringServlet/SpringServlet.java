package clq.SpringServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import clq.SpringDao.Springdao;
import clq.Springservice.SpringService;

//获取到Springdao和Springservice里的方法
@Repository(value="springservlet")
public class SpringServlet {
	@Autowired
	private Springdao springdao;
	@Autowired
	private SpringService springserice;
	public void find(){
		System.out.println("Springservlet......");
		springdao.add();
		springserice.flle();
	}
}
