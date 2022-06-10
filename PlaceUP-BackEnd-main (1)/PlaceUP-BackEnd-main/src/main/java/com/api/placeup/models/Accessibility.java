package com.api.placeup.models;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "accessibility")
public class Accessibility {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "wheelchair", nullable = false, length = 45)
    private String wheelchair;

    @Column(name = "visually_impaired", nullable = false, length = 45)
    private String visually_impaired;

    @Column(name = "hearing_impaired", nullable = false, length = 45)
    private String hearing_impaired;

    @Column(name = "mute", nullable = false, length = 45)
    private String mute;

    @OneToMany( mappedBy = "accessibility")
    private Set<Seller> seller;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWheelchair() {
        return wheelchair;
    }

    public void setWheelchair(String wheelchair) {
        this.wheelchair = wheelchair;
    }

    public String getVisually_impaired() {
        return visually_impaired;
    }

    public void setVisually_impaired(String visually_impaired) {
        this.visually_impaired = visually_impaired;
    }

    public String getHearing_impaired() {
        return hearing_impaired;
    }

    public void setHearing_impaired(String hearing_impaired) {
        this.hearing_impaired = hearing_impaired;
    }

    public String getMute() {
        return mute;
    }

    public void setMute(String mute) {
        this.mute = mute;
    }
}