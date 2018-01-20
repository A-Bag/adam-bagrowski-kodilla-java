package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired
    CompanyFacade companyFacade;

    @Autowired
    CompanyDao companyDao;

    private Employee johnSmith;
    private Employee stephanieClarckson;
    private Employee lindaKovalsky;
    private Company softwareMachine;
    private Company dataMaesters;
    private Company greyMatter;


    @Before
    public void beforeTest() {
        //Given
        johnSmith = new Employee("John", "Smith");
        stephanieClarckson = new Employee("Stephanie", "Clarckson");
        lindaKovalsky = new Employee("Linda", "Kovalsky");

        softwareMachine = new Company("Software Machine");
        dataMaesters = new Company("Data Maesters");
        greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
    }

    @After
    public void afterTest() {
        //CleanUp
        try {
            companyDao.delete(softwareMachine.getId());
            companyDao.delete(dataMaesters.getId());
            companyDao.delete(greyMatter.getId());
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindCompaniesByFragmentOfName() {
        //Given
        //When
        List<Company> foundCompanies = companyFacade.findCompaniesByFragmentOfName("er");
        //Then
        Assert.assertEquals(2, foundCompanies.size());
    }

    @Test
    public void testFindEmployeesByFragmentOfLastName() {
        //Given
        //When
        List<Employee> foundEmployees = companyFacade.findEmployeesByFragmentOfLastName("o");
        //Then
        Assert.assertEquals(2, foundEmployees.size());
    }

}