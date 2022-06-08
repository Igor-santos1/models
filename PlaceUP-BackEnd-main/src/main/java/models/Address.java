package models;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "zip_code", nullable = false, length = 20)
    private String zip_code;

    @Column(name = "street", nullable = false, length = 45)
    private String street;

    @Column(name = "city", nullable = false, length = 45)
    private String city;

    @Column(name = "number_house", nullable = false, length = 20)
    private Integer number_house;

    @OneToMany( mappedBy = "address")
    private Set<Seller> seller;

    public Set<Seller> getSeller() {
        return seller;
    }

    public void setSeller(Set<Seller> seller) {
        this.seller = seller;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getNumber_house() {
        return number_house;
    }

    public void setNumber_house(Integer number_house) {
        this.number_house = number_house;
    }
}