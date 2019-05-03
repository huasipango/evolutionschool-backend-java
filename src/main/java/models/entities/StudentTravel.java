package models.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="STUDENTTRAVEL")
public class StudentTravel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "STRID")
    private Integer strId;

    @JoinColumn(name = "STUID", referencedColumnName = "USEID")
    @ManyToOne
    private Student strStudent;

    @JoinColumn(name = "TRAID", referencedColumnName = "TRAID")
    @ManyToOne
    private Travel strTravel;

    public StudentTravel() {
    }

    public StudentTravel(Integer integer) {
    }

    public Integer getStrId() {
        return strId;
    }

    public void setStrId(Integer strId) {
        this.strId = strId;
    }

    public Student getStrStudent() {
        return strStudent;
    }

    public void setStrStudent(Student strStudent) {
        this.strStudent = strStudent;
    }

    public Travel getStrTravel() {
        return strTravel;
    }

    public void setStrTravel(Travel strTravel) {
        this.strTravel = strTravel;
    }
}
