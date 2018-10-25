package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchingFacadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    SearchingFacade searchingFacade;

    @Test
    public void testSearchFacadeCompanyLetters() throws SeacrhingInEntityException {

        //Given
        Employee employee1 = new Employee("Jan", "Kowalski");
        Company company1 = new Company("Kodilla");
        company1.getEmployees().add(employee1);
        employee1.getCompanies().add(company1);
        //When
        companyDao.save(company1);
        int companyId = company1.getId();
        List<Company> companiesWithThreeFirsLetters = searchingFacade.processCompanySearch( "kod");
        //Then
        assertNotEquals(0, company1);
        assertEquals(1, companiesWithThreeFirsLetters.size());
        //CleanUp
        companyDao.deleteById(companyId);
    }
    @Test
    public void testSearchFacadeEmployeeBySigns()throws SeacrhingInEntityException{
        //Given
        Employee employee1 = new Employee("Mateusz", "Morawiecki");
        Company company1 = new Company("IBM");
        company1.getEmployees().add(employee1);
        employee1.getCompanies().add(company1);
        //When
        employeeDao.save( employee1 );
        int emmployeeId=employee1.getId();
        List<Employee>employeesBySigns=searchingFacade.processEmployeeSearch( "wie" );
        //Then
        assertNotEquals(0, employee1);
        assertEquals(1, employeesBySigns.size());
        //CleanUp
        employeeDao.deleteById(emmployeeId);


    }
}
