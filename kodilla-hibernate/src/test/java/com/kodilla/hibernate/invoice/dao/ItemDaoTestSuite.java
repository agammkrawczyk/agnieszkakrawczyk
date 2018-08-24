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
public class ItemDaoTestSuite {
    @Autowired
    ItemDao itemDao;
    @Test
    public void itemDaoTest(){
        //Given
        Item item = new Item( 100,new BigDecimal( 1000 ),new BigDecimal( 2000 ) );
       //when
        itemDao.save( item );
        int id= item.getId();
        Optional<Item> items= itemDao.findById(id);
        //then
        Assert.assertEquals(id, items.get().getId());

        //CleanUp
      // itemDao.deleteById( id );

    }
}
