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

    @JoinColumn(name = "DRIID", referencedColumnName = "DRIID")
    @ManyToOne
    private Driver carDriver;

    public Car() {
    }

    public Car(Integer carId) {
        this.carId = carId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarLicensePlate() {
        return carLicensePlate;
    }

    public void setCarLicensePlate(String carLicensePlate) {
        this.carLicensePlate = carLicensePlate;
    }

    public Integer getCarYear() {
        return carYear;
    }

    public void setCarYear(Integer carYear) {
        this.carYear = carYear;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarAvatar() {
        return carAvatar;
    }

    public void setCarAvatar(String carAvatar) {
        this.carAvatar = carAvatar;
    }

    public Driver getCarDriver() {
        return carDriver;
    }

    public void setCarDriver(Driver carDriver) {
        this.carDriver = carDriver;
    }
}
