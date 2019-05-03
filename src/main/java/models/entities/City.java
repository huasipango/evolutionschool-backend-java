package models.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "CITY")
public class City implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CITID")
    private Integer citId;

    @Size(max = 50)
    @Column(name = "CITNAME")
    private String citName;

    @JoinColumn(name = "COUID", referencedColumnName = "COUID")
    @ManyToOne
    private Country citCountry;

    @OneToMany(mappedBy = "useCity", fetch = FetchType.LAZY)
    private List<User> citUsers;

    @OneToMany(mappedBy = "schoCity", fetch = FetchType.LAZY)
    private List<School> citSchools;

    public City() {
    }

    public City(Integer citId) {
        this.citId = citId;
    }

    public Integer getCitId() {
        return citId;
    }

    public void setCitId(Integer citId) {
        this.citId = citId;
    }

    public String getCitName() {
        return citName;
    }

    public void setCitName(String citName) {
        this.citName = citName;
    }

    public Country getCitCountry() {
        return citCountry;
    }

    public void setCitCountry(Country citCountry) {
        this.citCountry = citCountry;
    }

    public List<User> getCitUsers() {
        return citUsers;
    }

    public void setCitUsers(List<User> citUsers) {
        this.citUsers = citUsers;
    }
}
