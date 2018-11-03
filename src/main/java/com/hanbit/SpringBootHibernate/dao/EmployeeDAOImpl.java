/**
 * 
 */
package com.hanbit.SpringBootHibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.SpringBootHibernate.model.Employee;

/**
 * @author Bharat Kumar
 *
 */

@Repository("EmployeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
 
    public void addEmployee(Employee employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
    }
 
    @SuppressWarnings("unchecked")
    public List<Employee> getAllEmployees() {
    		System.out.println("####"+sessionFactory.getCurrentSession());
        return sessionFactory.getCurrentSession().createQuery("from Employee")
                .list();
    }
 
    @Override
    public void deleteEmployee(Integer employeeId) {
        Employee employee = (Employee) sessionFactory.getCurrentSession().load(
                Employee.class, employeeId);
        if (null != employee) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
    }
 
    public Employee getEmployee(int empid) {
        return (Employee) sessionFactory.getCurrentSession().get(
                Employee.class, empid);
    }
 
    @Override
    public Employee updateEmployee(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);
        return employee;
    }
}
