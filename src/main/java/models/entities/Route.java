package models.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ROUID")
    private Integer rouId;

    @Size(max = 100)
    @Column(name = "ROUZONE")
    @NotEmpty
    private String rouZone;

    @JoinColumn(name = "DRIID", referencedColumnName = "USEID")
    @ManyToOne
    private Driver rouDriver;

    @JoinColumn(name = "SCHID", referencedColumnName = "SCHID")
    @ManyToOne
    private School rouSchool;

    @OneToMany(mappedBy = "stuRoute", fetch = FetchType.LAZY)
    private List<Student> rouStudents;

    public Route() {
    }

    public Route(Integer rouId) {
        this.rouId = rouId;
    }

    public Integer getRouId() {
        return rouId;
    }

    public void setRouId(Integer rouId) {
        this.rouId = rouId;
    }

    public String getRouZone() {
        return rouZone;
    }

    public void setRouZone(String rouZone) {
        this.rouZone = rouZone;
    }

    public Driver getRouDriver() {
        return rouDriver;
    }

    public void setRouDriver(Driver rouDriver) {
        this.rouDriver = rouDriver;
    }

    public School getRouSchool() {
        return rouSchool;
    }

    public void setRouSchool(School rouSchool) {
        this.rouSchool = rouSchool;
    }

    public List<Student> getRouStudents() {
        return rouStudents;
    }

    public void setRouStudents(List<Student> rouStudents) {
        this.rouStudents = rouStudents;
    }
}
