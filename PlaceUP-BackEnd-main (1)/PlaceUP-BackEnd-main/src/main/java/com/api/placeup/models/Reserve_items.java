package com.api.placeup.models;

import javax.persistence.*;

@Entity
@Table(name = "reserve_items")
public class Reserve_items {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "reserve_quantity", nullable = false)
    private Integer reserve_quantity;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReserve_quantity() {
        return reserve_quantity;
    }

    public void setReserve_quantity(Integer reserve_quantity) {
        this.reserve_quantity = reserve_quantity;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}