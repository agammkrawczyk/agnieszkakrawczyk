package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDaoTestSuite {


        @Autowired
        private ProductDao productDao;
        @Test
        public void productDaoSave(){
            //given
            Product product= new Product( "pencil" );
            //when
            productDao.save( product );

            int id = product.getId();
            Optional<Product> readProductName= productDao.findById(id);
            //then
            Assert.assertEquals(id, readProductName.get().getId());

            //CleanUp
       //     productDao.deleteById( id );


    }
}
