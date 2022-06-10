package com.api.placeup.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "price", nullable = false, length = 20, precision = 2)
    private BigDecimal price;

    @Column(name = "data", nullable = false, length = 45)
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client cliente;

    @OneToMany( mappedBy = "reservation")
    private Set<Reserve_items> reserve_items;

    public Set<Reserve_items> getReserve_items() {
        return reserve_items;
    }

    public void setReserve_items(Set<Reserve_items> reserve_items) {
        this.reserve_items = reserve_items;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }
}