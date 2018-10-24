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

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

    public List<Employee> processEmployeeSearch( String employeeLastName) throws SeacrhingInEntityException {
        if (employeeLastName.length() < 1) {
            LOGGER.error(SeacrhingInEntityException.ERR_NULL_LENGHT);
            throw new SeacrhingInEntityException(SeacrhingInEntityException.ERR_NULL_LENGHT);
        }
        LOGGER.info("Start sreaching employee by lastname in entitiy - Mr/Mrs " + employeeLastName);
        List<Employee> employeesSreachingResult = employeeDao.findEmployeeByName(employeeLastName);
        if (employeesSreachingResult.size() == 0) {
            LOGGER.info("There are no employees with that lastname in this entity : -" + employeeLastName);
        }
        for (Employee theEmployee : employeesSreachingResult) {
            LOGGER.info("Result of sreaching.We find this employees in our entity: " + theEmployee.getFirstname() + " " + theEmployee.getLastname());
        }
        LOGGER.info("Searching for" + employeeLastName + "complete");

        return employeesSreachingResult;
    }
    public List<Company> processCompanySearch( String firstThreeLetters) throws SeacrhingInEntityException {
        if (firstThreeLetters.length() != 3) {
            LOGGER.error(SeacrhingInEntityException.ERR_WRONG_LENGHT);
            throw new SeacrhingInEntityException(SeacrhingInEntityException.ERR_NULL_LENGHT);
        }
        LOGGER.info("Start sreaching company in entity by first 3 letters "+firstThreeLetters);
        List<Company> companiesSreachingResult = companyDao.findCompanyByFewLetters( firstThreeLetters);
        if (companiesSreachingResult.size() == 0) {
            LOGGER.info("There are no companies in entitiy with first letters like " + firstThreeLetters);
        }
        for (Company theCompany : companiesSreachingResult) {
            LOGGER.info("Company that matches the search phrase: " + theCompany.getName());
        }
        LOGGER.info("Searching company by first 3 letters: -" + firstThreeLetters + " complete");
        return companiesSreachingResult;
    }
}

