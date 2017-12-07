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
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Arrange
        Product product1 = new Product("Produkt1");
        Product product2 = new Product("Produkt2");

        Item item1 = new Item(new BigDecimal(100), 10, new BigDecimal(1000));
        Item item2 = new Item(new BigDecimal(100), 100, new BigDecimal(10000));
        Item item3 = new Item(new BigDecimal(10), 100, new BigDecimal(1000));

        Invoice invoice1 = new Invoice("001");
        Invoice invoice2 = new Invoice("002");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item3);
        invoice2.getItems().add(item2);
        product1.getItems().add(item1);
        product1.getItems().add(item3);
        product2.getItems().add(item2);
        item1.setProduct(product1);
        item1.setInvoice(invoice1);
        item2.setProduct(product2);
        item2.setInvoice(invoice2);
        item3.setProduct(product1);
        item3.setInvoice(invoice1);

        //Act
        productDao.save(product1);
        productDao.save(product2);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);

        //Assert
        Assert.assertEquals(2, productDao.count());
        Assert.assertEquals(3, itemDao.count());
        Assert.assertEquals(2, invoiceDao.count());

        //CleanUp
        /*productDao.deleteAll();
        itemDao.deleteAll();
        invoiceDao.deleteAll();*/
    }
}
