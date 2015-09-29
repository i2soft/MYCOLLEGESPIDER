package com.collegespider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController
{
    @RequestMapping(value={"/","home","/home"},method=RequestMethod.GET)
    public ModelAndView displayHomePageData()
    {
    	ModelAndView mv= new ModelAndView();
    	mv.setViewName("home");
       
        return mv;
    }
    
    @RequestMapping(value="/adminhome",method=RequestMethod.GET)
    public ModelAndView displayAdminHomePage(){
    	
    	
    	ModelAndView mavAdminPage=new ModelAndView();
    	mavAdminPage.setViewName("adminhome");
    	return mavAdminPage;
    	
    }
    
    
    @RequestMapping(value="/studentprofile",method=RequestMethod.GET)
    public ModelAndView displayStudentProfile(){
    	
    	
    	ModelAndView mavStudentProfile=new ModelAndView();
    	mavStudentProfile.setViewName("studentprofile");
    	return mavStudentProfile;
    	
    }
    
    
    @RequestMapping(value="/facultyprofile",method=RequestMethod.GET)
    public ModelAndView displayFacultyProfile(){
    	
    	
    	ModelAndView mavFacultyProfile=new ModelAndView();
    	mavFacultyProfile.setViewName("facultyprofile");
    	return mavFacultyProfile;
    	
    }
    
    @RequestMapping(value="/evenglistprofile",method=RequestMethod.GET)
    public ModelAndView displayEvengListProfile(){
    	
    	
    	ModelAndView mavEvengListProfile=new ModelAndView();
    	mavEvengListProfile.setViewName("evenglistprofile");
    	return mavEvengListProfile;
    	
    }
    
    @RequestMapping(value="/help",method=RequestMethod.GET)
    public ModelAndView displayHelpPage(){
    	
    	
    	ModelAndView mavHelp=new ModelAndView();
    	mavHelp.setViewName("help");
    	return mavHelp;
    	
    }
    
    @RequestMapping(value="/about_us",method=RequestMethod.GET)
    public ModelAndView displayAbout_Uspage(){
    	
    	
    	ModelAndView mavAU=new ModelAndView();
    	mavAU.setViewName("about_us");
    	return mavAU;
    	
    }
    
    @RequestMapping(value="/contact_us",method=RequestMethod.GET)
    public ModelAndView displayContact_UsPage(){
    	
    	
    	ModelAndView mavCU=new ModelAndView();
    	mavCU.setViewName("contact_us");
    	return mavCU;
    	
    }
    
    @RequestMapping(value="/news",method=RequestMethod.GET)
    public ModelAndView displayNews(){
    	
    	
    	ModelAndView mavNews=new ModelAndView();
    	mavNews.setViewName("news");
    	return mavNews;
    	
    }
    
    
    
}