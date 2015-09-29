package com.collegespider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.collegespider.bean.LoginBean;
import com.collegespider.domain.User;
import com.collegespider.dto.UserDTO;
import com.collegespider.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public ModelAndView doRegistration(Model model, LoginBean loginBean,
			BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		UserDTO user = loginService.loginProcess(loginBean);
		String type = "";
		if (null != user ) {
			type = user.getUsertype();

		    modelAndView.addObject("userdata", user);

		    if (type.equalsIgnoreCase("ADMIN")) {
			
			     modelAndView.setViewName("adminhome");
			
		    } else if (type.equalsIgnoreCase("STUDENT")) {
			
			     modelAndView.setViewName("studentprofile");
			
		    } else if (type.equalsIgnoreCase("FACULTY")) {
			
			     modelAndView.setViewName("facultyprofile");
			
		    } else {

			     modelAndView.setViewName("evenglistprofile");

		    }

		}
		
		else{
			
			modelAndView.setViewName("home");
		}

		return modelAndView;

	}

}