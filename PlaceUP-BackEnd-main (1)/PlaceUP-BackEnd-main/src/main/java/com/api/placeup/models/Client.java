package com.api.placeup.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "client")
public class Client<mappedBy> {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "password", nullable = false, length = 45)
    private String password;

    @Column(name = "phone", nullable = false, length = 45)
    private String phone;

    @Column(name = "birth", nullable = false, length = 45)
    private String birth;

    @Column(name = "status", nullable = false, length = 45)
    private Boolean status;


    @OneToMany( mappedBy = "cliente")
    private Set<Reservation> reservation;

    public Set<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(Set<Reservation> reservation) {
        this.reservation = reservation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}