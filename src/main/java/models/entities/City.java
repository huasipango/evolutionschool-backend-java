package models.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CITY")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CITID")
    private Integer citId;

    @Size(max = 50)
    @Column(name = "CITNAME")
    private String citName;


}
