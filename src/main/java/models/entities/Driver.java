package models.entities;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

public class Driver extends User {

    @Size(max = 300)
    @Column(name = "DRILICENSEPHOTO")
    private String driLicensePhoto;

    @OneToMany(mappedBy = "carDriver", fetch = FetchType.LAZY)
    private List<Car> driCars;

    @OneToMany(mappedBy = "rouDriver", fetch = FetchType.LAZY)
    private List<Route> driRoutes;


    public Driver() {
    }

    public Driver(Integer useId) {
        super(useId);
    }

    public String getDriLicensePhoto() {
        return driLicensePhoto;
    }

    public void setDriLicensePhoto(String driLicensePhoto) {
        this.driLicensePhoto = driLicensePhoto;
    }

    public List<Car> getDriCars() {
        return driCars;
    }

    public void setDriCars(List<Car> driCars) {
        this.driCars = driCars;
    }

    public List<Route> getDriRoutes() {
        return driRoutes;
    }

    public void setDriRoutes(List<Route> driRoutes) {
        this.driRoutes = driRoutes;
    }
}
