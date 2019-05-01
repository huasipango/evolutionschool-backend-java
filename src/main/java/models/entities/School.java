package models.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class School {

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
}
