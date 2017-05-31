package com.dharam.hibernate.test.main;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dharam.hibernate.test.domain.Role;
import com.dharam.hibernate.test.domain.User;

public class TestUser {
	
	public static void main(String[] args) {
			
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory(); //Connection Pool
		Session session = sessionFactory.openSession(); //Connection
		
		User user1 = new User(1L,"abc","xyz","abc1@xyz.com",new Date());
		User user2 = new User(2L,"pqr","xyz","pqr2@xyz.com",new Date());
		
		/*Role role1 = new Role();
		role1.setRoleName("ROLE_USER");
		
		session.save(role1);
		
		Role role2 = new Role();
		role2.setRoleName("ROLE_ADMIN");
		session.save(role2);
		
		Set<Role> roles = new HashSet<Role>();
		roles.add(role1);
		
		user1.setRoles(roles);
		
		roles = new HashSet<Role>();
		roles.add(role2);
		user2.setRoles(roles);*/
		
		/*Transaction transaction = session.beginTransaction();
		
		System.out.println(session.save(user1));
		System.out.println(session.save(user2));
		
		transaction.commit();*/
		
		
		/*User users = (User) session.createQuery("from User where userid = ? ").setParameter(0, 2).uniqueResult();
		System.out.println(users);*/
		
		User users2 = (User) session.get(User.class,1L);
		System.out.println(users2);
		
		User users3 = (User) session.get(User.class,1L);
		System.out.println(users3);
		
		
		session.close();
		System.out.println("closing session factory");
		sessionFactory.close();
		
		
	}
}
