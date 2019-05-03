package models.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="STUDENT")
public class Student extends User implements Serializable {

    @JoinColumn(name = "FATID", referencedColumnName = "USEID")
    @ManyToOne
    private Father stuFather;

    @JoinColumn(name = "ROUID", referencedColumnName = "ROUID")
    @ManyToOne
    private Route stuRoute;

    @JoinColumn(name = "SCHID", referencedColumnName = "SCHID")
    @ManyToOne
    private School stuSchool;

    @JoinColumn(name = "LOCID", referencedColumnName = "LOCID")
    @ManyToOne
    private Location stuLocation;

    @OneToMany(mappedBy = "absStudent", fetch = FetchType.LAZY)
    private List<Absense> stuAbsenses;

    @OneToMany(mappedBy = "strStudent", fetch = FetchType.LAZY)
    private List<StudentTravel> stuStudentTravels;

    public Student() {
    }

    public Student(Integer useId) {
        super(useId);
    }

    public Father getStuFather() {
        return stuFather;
    }

    public void setStuFather(Father stuFather) {
        this.stuFather = stuFather;
    }

    public Route getStuRoute() {
        return stuRoute;
    }

    public void setStuRoute(Route stuRoute) {
        this.stuRoute = stuRoute;
    }

    public School getStuSchool() {
        return stuSchool;
    }

    public void setStuSchool(School stuSchool) {
        this.stuSchool = stuSchool;
    }

    public Location getStuLocation() {
        return stuLocation;
    }

    public void setStuLocation(Location stuLocation) {
        this.stuLocation = stuLocation;
    }

    public List<Absense> getStuAbsenses() {
        return stuAbsenses;
    }

    public void setStuAbsenses(List<Absense> stuAbsenses) {
        this.stuAbsenses = stuAbsenses;
    }

    public List<StudentTravel> getStuStudentTravels() {
        return stuStudentTravels;
    }

    public void setStuStudentTravels(List<StudentTravel> stuStudentTravels) {
        this.stuStudentTravels = stuStudentTravels;
    }
}
