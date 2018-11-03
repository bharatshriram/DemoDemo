/**
 * 
 */
package com.hanbit.SpringBootHibernate.dao;

import java.sql.SQLException;

import com.hanbit.SpringBootHibernate.model.LoginVO;

/**
 * @author USER
 *
 */
public interface LoginDAO {

	public String LoginCheckDAO(LoginVO loginvo) throws ClassNotFoundException, SQLException;
	
	
	
}
