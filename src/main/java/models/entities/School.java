package models.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="SCHOOL")
public class School implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SCHID")
    private Integer schId;

    @Size(max = 250)
    @Column(name = "SCHNAME")
    @NotNull
    private String schName;

    @Size(max = 15)
    @Column(name = "SCHPHONE")
    private String schPhone;

    @OneToMany(mappedBy = "rouSchool", fetch = FetchType.LAZY)
    private List<Route> schRoutes;

    @OneToMany(mappedBy = "stuSchool", fetch = FetchType.LAZY)
    private List<Student> schStudents;

    @JoinColumn(name = "LOCID", referencedColumnName = "LOCID")
    @ManyToOne
    private Location schLocation;

    @JoinColumn(name = "CITID", referencedColumnName = "CITID")
    @ManyToOne
    private City schCity;

    public School() {
    }

    public School(Integer schId) {
        this.schId = schId;
    }

    public Integer getSchId() {
        return schId;
    }

    public void setSchId(Integer schId) {
        this.schId = schId;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public String getSchPhone() {
        return schPhone;
    }

    public void setSchPhone(String schPhone) {
        this.schPhone = schPhone;
    }

    public List<Route> getSchRoutes() {
        return schRoutes;
    }

    public void setSchRoutes(List<Route> schRoutes) {
        this.schRoutes = schRoutes;
    }

    public List<Student> getSchStudents() {
        return schStudents;
    }

    public void setSchStudents(List<Student> schStudents) {
        this.schStudents = schStudents;
    }

    public Location getSchLocation() {
        return schLocation;
    }

    public void setSchLocation(Location schLocation) {
        this.schLocation = schLocation;
    }

    public City getSchCity() {
        return schCity;
    }

    public void setSchCity(City schCity) {
        this.schCity = schCity;
    }
}
