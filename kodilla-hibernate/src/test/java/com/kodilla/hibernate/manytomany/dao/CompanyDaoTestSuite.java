package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee( "John", "Smith" );
        Employee stephanieClarckson = new Employee( "Stephanie", "Clarckson" );
        Employee lindaKovalsky = new Employee( "Linda", "Kovalsky" );

        Company softwareMachine = new Company( "Software Machine" );
        Company dataMaesters = new Company( "Data Maesters" );
        Company greyMatter = new Company( "Grey Matter" );

        softwareMachine.getEmployees().add( johnSmith );
        dataMaesters.getEmployees().add( stephanieClarckson );
        dataMaesters.getEmployees().add( lindaKovalsky );
        greyMatter.getEmployees().add( johnSmith );
        greyMatter.getEmployees().add( lindaKovalsky );

        johnSmith.getCompanies().add( softwareMachine );
        johnSmith.getCompanies().add( greyMatter );
        stephanieClarckson.getCompanies().add( dataMaesters );
        lindaKovalsky.getCompanies().add( dataMaesters );
        lindaKovalsky.getCompanies().add( greyMatter );

        //When
        companyDao.save( softwareMachine );
        int softwareMachineId = softwareMachine.getId();
        companyDao.save( dataMaesters );
        int dataMaestersId = dataMaesters.getId();
        companyDao.save( greyMatter );
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals( 0, softwareMachineId );
        Assert.assertNotEquals( 0, dataMaestersId );
        Assert.assertNotEquals( 0, greyMatterId );

        //  CleanUp
        try {
            companyDao.deleteById( softwareMachineId );
            companyDao.deleteById( dataMaestersId );
            companyDao.deleteById( greyMatterId );
        } catch (Exception e) {

        }
    }

    @Test
    public void testfindCompanyByfewLetters() {
        Company company = new Company( "Airbus" );
        Company company1 = new Company( "Boeing" );
        Company company2 = new Company( " Embraer" );

        Employee employee = new Employee( "Jan", "Kowalski" );
        Employee employee1 = new Employee( " Stefan", " Nowak" );
        Employee employee2 = new Employee( " Piotr", "Nowicki" );

        employee.getCompanies().add( company );
        employee1.getCompanies().add( company1 );
        employee2.getCompanies().add( company2 );

        company.getEmployees().add( employee );
        company1.getEmployees().add( employee1 );
        company2.getEmployees().add( employee2 );
// When
        companyDao.save( company );
        int companyID = company.getId();
        companyDao.save( company1 );
        int company1ID = company1.getId();
        companyDao.save( company2 );
        int company2ID = company2.getId();

        List<Company> findCompany = companyDao.findCompanyByFewLetters( "Air" );
// Then

        Assert.assertEquals( 1, findCompany.size() );
//        //CleanUp
        companyDao.deleteById( companyID );
        companyDao.deleteById( company1ID );
        companyDao.deleteById( company2ID );
    }

    @Test
    public void testFindEmployeeBySurname() {
        Employee employee = new Employee( "Mateusz", "Kowalski" );
        Employee employee1 = new Employee( " Maciej", "Nowak" );


        Company company = new Company( "Apple" );
        Company company1 = new Company( "IBM" );

        employee.getCompanies().add( company );
        employee1.getCompanies().add( company1 );


        company.getEmployees().add( employee );
        company1.getEmployees().add( employee1 );

        employeeDao.save( employee );
        int cID = employee.getId();
        employeeDao.save( employee1 );
        int c1ID = employee1.getId();
//When
        List<Employee> employeesByLastName = employeeDao.findEmployeeByName( "Nowak" );

        //Then
        Assert.assertEquals( 1, employeesByLastName.size() );
        //CleanUp
        employeeDao.deleteById( cID );
        employeeDao.deleteById( c1ID );

    }

}
