package models.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="LOCATION")
public class Location implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LOCID")
    private Integer locId;

    @Size(max = 250)
    @Column(name = "LOCSTREET1")
    private String locStreet1;

    @Size(max = 250)
    @Column(name = "LOCSTREET2")
    private String locStreet2;

    @Size(max = 250)
    @Column(name = "LOCREFERENCE")
    private String locReference;

    @Size(max = 250)
    @Column(name = "LOCNEIGHBORHOOD")
    private String locNeighborhood;

    @OneToMany(mappedBy = "schLocation", fetch = FetchType.LAZY)
    private List<School> locSchools;

    @OneToMany(mappedBy = "stuLocation", fetch = FetchType.LAZY)
    private List<Student> locStudents;

    public Location() {
    }

    public Location(Integer locId) {
        this.locId = locId;
    }

    public Integer getLocId() {
        return locId;
    }

    public void setLocId(Integer locId) {
        this.locId = locId;
    }

    public String getLocStreet1() {
        return locStreet1;
    }

    public void setLocStreet1(String locStreet1) {
        this.locStreet1 = locStreet1;
    }

    public String getLocStreet2() {
        return locStreet2;
    }

    public void setLocStreet2(String locStreet2) {
        this.locStreet2 = locStreet2;
    }

    public String getLocReference() {
        return locReference;
    }

    public void setLocReference(String locReference) {
        this.locReference = locReference;
    }

    public String getLocNeighborhood() {
        return locNeighborhood;
    }

    public void setLocNeighborhood(String locNeighborhood) {
        this.locNeighborhood = locNeighborhood;
    }

    public List<School> getLocSchools() {
        return locSchools;
    }

    public void setLocSchools(List<School> locSchools) {
        this.locSchools = locSchools;
    }

    public List<Student> getLocStudents() {
        return locStudents;
    }

    public void setLocStudents(List<Student> locStudents) {
        this.locStudents = locStudents;
    }
}
