package com.api.placeup.models;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product implements Comparable<Product>{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "price", nullable = false, length = 20, precision = 2)
    private Double price;

    @Column(name = "product_brand", nullable = false, length = 45)
    private String product_brand;

    @Column(name = "products_name", nullable = false, length = 45)
    private String products_name;

    @Column(name = "category", nullable = false, length = 45)
    private String category;

    @Column(name = "expiration_date", nullable = false, length = 45)
    private LocalDate expiration_date;

    @Column(name = "status", nullable = false)
    private Boolean status;


    @OneToMany( mappedBy = "product")
    private Set<Reserve_items> reserve_items;

    @ManyToOne
    @JoinColumn(name = "seller")
    private Seller seller;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProduct_brand() {
        return product_brand;
    }

    public void setProduct_brand(String product_brand) {
        this.product_brand = product_brand;
    }

    public String getProducts_name() {
        return products_name;
    }

    public void setProducts_name(String products_name) {
        this.products_name = products_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(LocalDate expiration_date) {
        this.expiration_date = expiration_date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Set<Reserve_items> getReserve_items() {
        return reserve_items;
    }

    public void setReserve_items(Set<Reserve_items> reserve_items) {
        this.reserve_items = reserve_items;
    }




    // metodo para ordenar lista
    // retorna do menor para o maior, para trocar do maior para o menor

    @Override
    public int compareTo(Product outroProduto) {
        // ordem crescente
        if (this.price > outroProduto.getPrice()) {
            return 1;
        } if (this.price < outroProduto.getPrice()) {
            return -1;
        }
        return 0;
        /*
            ordem decrescente
            if (this.price > outroProduto.getPrice()) {
                return -1;
            } if (this.price < outroProduto.getPrice()) {
                return 1;
            }
            return 0;
        */
    }
}