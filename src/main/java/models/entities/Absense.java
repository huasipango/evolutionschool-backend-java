package models.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name="ABSENSE")
public class Absense implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ABSID")
    private Integer absId;

    @Column(name = "ABSDATE")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotEmpty
    private Calendar absDate;

    @Size(max = 150)
    @Column(name = "ABSREASON")
    private String absReason;

    @JoinColumn(name = "STUID", referencedColumnName = "USEID")
    @ManyToOne
    private Student absStudent;

    public Absense() {
    }

    public Absense(Integer absId) {
        this.absId = absId;
    }

    public Integer getAbsId() {
        return absId;
    }

    public void setAbsId(Integer absId) {
        this.absId = absId;
    }

    public Calendar getAbsDate() {
        return absDate;
    }

    public void setAbsDate(Calendar absDate) {
        this.absDate = absDate;
    }

    public String getAbsReason() {
        return absReason;
    }

    public void setAbsReason(String absReason) {
        this.absReason = absReason;
    }

    public Student getAbsStudent() {
        return absStudent;
    }

    public void setAbsStudent(Student absStudent) {
        this.absStudent = absStudent;
    }
}
