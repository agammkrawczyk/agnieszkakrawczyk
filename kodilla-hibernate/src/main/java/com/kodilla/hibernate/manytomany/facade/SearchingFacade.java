package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchingFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger( SearchingFacade.class );

    public List<Employee> processEmployeeSearch(String signs) throws SeacrhingInEntityException {
        if (signs.length() < 1) {
            LOGGER.error( SeacrhingInEntityException.ERR_NULL_LENGHT );
            throw new SeacrhingInEntityException( SeacrhingInEntityException.ERR_NULL_LENGHT );
        } else if (signs.length() != 3) {
            LOGGER.error( SeacrhingInEntityException.ERR_WRONG_LENGHT );
            throw new SeacrhingInEntityException( SeacrhingInEntityException.ERR_NULL_LENGHT );
        } else {

            LOGGER.info( "Start sreaching employee by few signs in entitiy - Mr/Mrs " + signs );
            List<Employee> employeesSreachingResult = employeeDao.findEmployeeBySigns( signs );
            if (employeesSreachingResult.size() == 0) {
                LOGGER.info( "There are no employees with this signs in this entity : -" + signs );
            }
            for (Employee theEmployee : employeesSreachingResult) {
                LOGGER.info( "Result of sreaching.We find this employees in our entity: " + theEmployee.getFirstname() + " " + theEmployee.getLastname() );
            }
            LOGGER.info( "Searching for " + signs + " complete" );

            return employeesSreachingResult;
        }
    }
        public List<Company> processCompanySearch (String signs) throws SeacrhingInEntityException {
            if (signs.length() != 3) {
                LOGGER.error( SeacrhingInEntityException.ERR_WRONG_LENGHT );
                throw new SeacrhingInEntityException( SeacrhingInEntityException.ERR_NULL_LENGHT );
            }
            LOGGER.info( "Start sreaching company in entity by 3 letters " + signs );
            List<Company> companiesSreachingResult = companyDao.findCompanyBySigns( signs );
            if (companiesSreachingResult.size() == 0) {
                LOGGER.info( "There are no companies in entitiy signs  letters like " + signs
                );
            }
            for (Company theCompany : companiesSreachingResult) {
                LOGGER.info( "Company that matches the search phrase: " + theCompany.getName() );
            }
            LOGGER.info( "Searching company by first 3 letters: -" + signs + " complete" );
            return companiesSreachingResult;
        }
    }

