package com.collegespider.dao;

import com.collegespider.bean.LoginBean;
import com.collegespider.dto.UserDTO;

public interface LoginDao {
	public UserDTO validateLogin(LoginBean loginBean);

}
