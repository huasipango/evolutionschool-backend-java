package models.entities;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Driver extends User {

    @Size(max = 100)
    @Column(name = "DRILICENSEPHOTO")
    private String driLicensePhoto;


}
