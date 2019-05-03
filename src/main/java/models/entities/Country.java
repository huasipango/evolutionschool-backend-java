package models.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "COUNTRY")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COUID")
    private Integer couId;

    @Size(max = 50)
    @Column(name = "COUNAME")
    private String couName;

    @OneToMany(mappedBy = "citCountry", fetch = FetchType.LAZY)
    private List<City> couCities;

    public Country() {
    }

    public Country(Integer couId) {
        this.couId=couId;
    }

    public Integer getCouId() {
        return couId;
    }

    public void setCouId(Integer couId) {
        this.couId = couId;
    }

    public String getCouName() {
        return couName;
    }

    public void setCouName(String couName) {
        this.couName = couName;
    }

    public List<City> getCouCities() {
        return couCities;
    }

    public void setCouCities(List<City> couCities) {
        this.couCities = couCities;
    }
}
