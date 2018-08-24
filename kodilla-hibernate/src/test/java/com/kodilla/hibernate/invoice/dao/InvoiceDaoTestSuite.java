package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Test
    public void testInvoiceDaoSave(){

       //Given
        Product product1= new Product( "pencil" );
        Product product2= new Product( " pen" );
        Item item1= new Item( 10,new BigDecimal( 100 ), new BigDecimal( 200 ) );
        Item item2= new Item( 15, new BigDecimal( 200 ), new BigDecimal( 50 ) );


        Invoice invoice= new Invoice("ONE");
        product1.getItems().add( item1); ;
        product2.getItems().add( item2 );


        invoice.getItems().add( item1 );
        invoice.getItems().add( item2 );
        item1.setInvoice( invoice );
        item2.setInvoice( invoice );
        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        //   taskListDao.deleteById(id);
    }


    }

