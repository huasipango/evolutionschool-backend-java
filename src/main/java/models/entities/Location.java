package models.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LOCID")
    private Integer locId;

    @Size(max = 250)
    @Column(name = "LOCSTREET1")
    private String locStreet1;

    @Size(max = 250)
    @Column(name = "LOCSTREET2")
    private String locStreet2;

    @Size(max = 250)
    @Column(name = "LOCREFERENCE")
    private String locReference;

    @Size(max = 250)
    @Column(name = "LOCNEIGHBORHOOD")
    private String locNeighborhood;
}
