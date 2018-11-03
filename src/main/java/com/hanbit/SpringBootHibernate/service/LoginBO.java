/**
 * 
 */
package com.hanbit.SpringBootHibernate.service;

import java.sql.SQLException;

import com.hanbit.SpringBootHibernate.model.LoginVO;

/**
 * @author Bharat Kumar
 *
 */


public interface LoginBO {
	
	public String CheckLogin(LoginVO loginvo) throws ClassNotFoundException, SQLException;

}
