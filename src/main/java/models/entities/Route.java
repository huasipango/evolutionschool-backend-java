package models.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

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



}
