package models.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "COUNTRY")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COUID")
    private Integer couId;

    @Size(max = 50)
    @Column(name = "COUNAME")
    private String couName;


}
