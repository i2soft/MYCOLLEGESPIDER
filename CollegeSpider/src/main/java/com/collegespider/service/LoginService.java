package com.collegespider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegespider.bean.LoginBean;
import com.collegespider.dao.LoginDao;
import com.collegespider.dto.UserDTO;

@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;

	public UserDTO loginProcess(LoginBean loginBean) {
		UserDTO userDTO = loginDao.validateLogin(loginBean);
		return userDTO;

	}

}
