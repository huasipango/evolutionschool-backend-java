package models.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Calendar;

public class Absense {

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


}
