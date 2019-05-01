package models.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ROLE")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ROLID")
    private Integer rolId;

    @Size(max = 50)
    @Column(name = "ROLNAME")
    private String rolName;

}
