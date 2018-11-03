/**
 * 
 */
package com.hanbit.SpringBootHibernate.dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.SpringBootHibernate.model.LoginVO;

/**
 * @author Bharat Kumar
 *
 */
@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	SessionFactory sessionfactory;
	
	@Override
	public String LoginCheckDAO(LoginVO loginvo)throws ClassNotFoundException,  SQLException {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(sessionfactory.getCurrentSession()+"!!!@@@@@@@@@@"+loginvo.getPassword());
			Query query = sessionfactory.getCurrentSession().createQuery("from LoginVO as mdc where mdc.userName=:p1 and mdc.password=:p2");
			query.setString("p1", loginvo.getUserName());
			query.setString("p2", loginvo.getPassword());
			System.out.println("Total");
			System.out.println("TotaSDl");
			List l =query.list();
			System.out.println("Total Number Of Records : "+l.size());
			Iterator it = l.iterator();

			if(it.hasNext())
			{
				
				LoginVO o = (LoginVO)it.next();
				System.out.println("oooo==>"+o);
				/*LoginVO p = (LoginVO)o;*/
				System.out.println("Suceess=====>"+o.getUserName());
				
				/*ResonseVO p = (ResonseVO)o;
				System.out.println("Product id :"+p.setResult("Success"));
				System.out.println("Product Name : "+p.getProName());
				System.out.println("Product Price : "+p.getPrice());
				System.out.println("----------------------");*/
			}
		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		}finally {
			
		}
		
		
		
		
		
		return null;
	}

}
