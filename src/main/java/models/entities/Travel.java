package models.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Time;
import java.util.Calendar;

public class Travel {

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


}
