package com.collegespider.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.collegespider.bean.LoginBean;
import com.collegespider.domain.User;
import com.collegespider.dto.UserDTO;


@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public UserDTO validateLogin(LoginBean loginBean) {
		boolean isAvailable = false;
		Session session = sessionFactory.openSession();
		Query query = session
				.createQuery("from  User u where u.email = :email and u.password = :password");
		query.setParameter("email", loginBean.getEmailId());
		query.setParameter("password", loginBean.getPassword());

		UserDTO userDTO=null;
		List<User> users = query.list();
		if (users != null && !users.isEmpty()) {
			isAvailable = true;
		
	    userDTO = new UserDTO(); 
		userDTO.setName(users.get(0).getName());
		userDTO.setUsertype(users.get(0).getUsertype());
		
		}
		
		

		//session.close();

		return userDTO;

	}

}
