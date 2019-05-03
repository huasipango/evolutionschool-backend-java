package models.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name="TRAVEL")
public class Travel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TRAID")
    private Integer traId;

    @Column(name = "TRASTARTTIME")
    @Temporal(TemporalType.TIME)
    private Time traStartTime;

    @Column(name = "TRAENDTIME")
    @Temporal(TemporalType.TIME)
    private Time traEndTime;

    @OneToMany(mappedBy = "strTravel", fetch = FetchType.LAZY)
    private List<StudentTravel> traStudentTravels;

    public Travel() {
    }

    public Travel(Integer traId) {
        this.traId = traId;
    }

    public Integer getTraId() {
        return traId;
    }

    public void setTraId(Integer traId) {
        this.traId = traId;
    }

    public Time getTraStartTime() {
        return traStartTime;
    }

    public void setTraStartTime(Time traStartTime) {
        this.traStartTime = traStartTime;
    }

    public Time getTraEndTime() {
        return traEndTime;
    }

    public void setTraEndTime(Time traEndTime) {
        this.traEndTime = traEndTime;
    }

    public List<StudentTravel> getTraStudentTravels() {
        return traStudentTravels;
    }

    public void setTraStudentTravels(List<StudentTravel> traStudentTravels) {
        this.traStudentTravels = traStudentTravels;
    }
}
