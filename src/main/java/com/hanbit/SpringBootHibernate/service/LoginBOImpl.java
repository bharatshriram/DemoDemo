/**
 * 
 */
package com.hanbit.SpringBootHibernate.service;

import java.sql.SQLException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import com.hanbit.SpringBootHibernate.dao.LoginDAO;
import com.hanbit.SpringBootHibernate.model.LoginVO;

/**
 * @author Bharat Kumar
 *
 */
@Service
public class LoginBOImpl implements LoginBO {
	
	@Autowired
	LoginDAO logindao;
	
	@Transactional
	public String CheckLogin(LoginVO loginvo) throws ClassNotFoundException, SQLException{
		
		String reult=logindao.LoginCheckDAO(loginvo) ;
		
		
		
		return null;
	}
	

}
