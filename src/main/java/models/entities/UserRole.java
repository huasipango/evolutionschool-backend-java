package models.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="USERROLE")
public class UserRole implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UROID")
    private Integer uroId;

    @JoinColumn(name = "USEID", referencedColumnName = "USEID")
    @ManyToOne
    private User uroUser;

    @JoinColumn(name = "ROLID", referencedColumnName = "ROLID")
    @ManyToOne
    private User uroRole;

    public UserRole() {
    }

    public UserRole(Integer uroId) {
        this.uroId = uroId;
    }

    public Integer getUroId() {
        return uroId;
    }

    public void setUroId(Integer uroId) {
        this.uroId = uroId;
    }

    public User getUroUser() {
        return uroUser;
    }

    public void setUroUser(User uroUser) {
        this.uroUser = uroUser;
    }

    public User getUroRole() {
        return uroRole;
    }

    public void setUroRole(User uroRole) {
        this.uroRole = uroRole;
    }
}
