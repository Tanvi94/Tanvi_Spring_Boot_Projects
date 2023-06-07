package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {
    //define field for entity manager
    private EntityManager entityManager;

    //set up constructor injection
    public EmployeeDAOJPAImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;

    }
    @Override
    public List<Employee> findAll() {
        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        //execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        //return the results

        return employees;
    }
}
