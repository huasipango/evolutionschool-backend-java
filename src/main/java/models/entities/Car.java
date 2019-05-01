package models.entities;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CARID")
    private Integer carId;

    @Size(max = 10)
    @Column(name = "CARLICENSEPLATE")
    @NotEmpty
    private String carLicensePlate;

    @Max(value = 2022)
    @Min(value = 1990)
    @Column(name = "CARYEAR")
    @NotEmpty
    private Integer carYear;

    @Size(max = 100)
    @Column(name = "CARBRAND")
    @NotEmpty
    private String carBrand;

    @Size(max = 50)
    @Column(name = "CARMODEL")
    @NotEmpty
    private String carModel;

    @Size(max = 300)
    @Column(name = "CARAVATAR")
    private String carAvatar;
}
