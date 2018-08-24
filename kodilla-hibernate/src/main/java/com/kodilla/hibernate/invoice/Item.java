package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@Entity
@Table(name = "ITEM")
public class Item {
    private int id;
    private int quantity;
    private BigDecimal price;
    private BigDecimal value;
    private Invoice invoice;
    private  Product product;

    public Item() {
    }

    public Item(int quantity, BigDecimal price, BigDecimal value) {
        this.quantity = quantity;
        this.price = price;
        this.value = value;

    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = " ITEM_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER )
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }


    @ManyToOne(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER )
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setProduct(Product product) {
        this.product = product;}

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }


}
