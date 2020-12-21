package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import business.UserBusinessLogic;
import model.User;

@Controller
public class RegisterController {

	@RequestMapping(value ="/register")
	public ModelAndView getRegistration(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		int id = Integer.parseInt(request.getParameter("id")); 
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
		ConfigurableApplicationContext cp =new ClassPathXmlApplicationContext("resource/appContext.xml");
		
		UserBusinessLogic ub = (UserBusinessLogic) cp.getBean("bizLogic");
		ub.createUser(new User(id,email,password,name));
		cp.close();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("nm", name);
		mv.addObject("em", email);
		return mv;
		
	}
	
}
