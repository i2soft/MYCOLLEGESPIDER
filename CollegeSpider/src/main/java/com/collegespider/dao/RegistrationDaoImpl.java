package com.collegespider.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.collegespider.bean.RegistrationBean;
import com.collegespider.domain.User;

@Repository
@Transactional
public class RegistrationDaoImpl implements RegistrationDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveRegisteredData(RegistrationBean registerBean) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		

		User user = new User();
		user.setName(registerBean.getName());
		user.setEmail(registerBean.getEmail());
		user.setPassword(registerBean.getPassword());
		user.setUsertype(registerBean.getUsertype());

		session.save(user);
		transaction.commit();

		session.close();
		

	}

}
