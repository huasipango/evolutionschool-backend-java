package models.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

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

    @OneToMany(mappedBy = "uroRole", fetch = FetchType.LAZY)
    private List<UserRole> rolUserRoles;

    public Role() {
    }

    public Role(Integer rolId) {
        this.rolId = rolId;
    }

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public List<UserRole> getRolUserRoles() {
        return rolUserRoles;
    }

    public void setRolUserRoles(List<UserRole> rolUserRoles) {
        this.rolUserRoles = rolUserRoles;
    }
}
