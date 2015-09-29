package com.collegespider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.collegespider.bean.RegistrationBean;
import com.collegespider.service.RegistrationService;




@Controller
public class RegController
{
	
	 @Autowired
	    private RegistrationService registrationService;
	
	
    @RequestMapping(value="/registration",method=RequestMethod.GET)
    public ModelAndView displayHomePageData()
    {
    	ModelAndView mvReg= new ModelAndView();
    	mvReg.setViewName("registration");
       
        return mvReg;
    }
    @RequestMapping( method = RequestMethod.POST)
    public String doRegistration(Model model, RegistrationBean registerBean, BindingResult bindingResult) {
        
            registrationService.processRegisteration(registerBean);
           
            
            return "registered";
        
    }
    
    
    
}