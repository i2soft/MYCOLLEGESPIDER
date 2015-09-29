package com.collegespider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegespider.bean.RegistrationBean;
import com.collegespider.dao.RegistrationDao;



@Service
public class RegistrationService {
	
	
	 @Autowired
	    private RegistrationDao registrationDao;   
	  
	    public void processRegisteration(RegistrationBean registerBean) {
	    	
	    		 registrationDao.saveRegisteredData(registerBean);
	    	
	       
	    }

	   

}
