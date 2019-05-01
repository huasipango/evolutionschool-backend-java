package models.entities;

import javax.persistence.*;

public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UROID")
    private Integer uroId;

}
