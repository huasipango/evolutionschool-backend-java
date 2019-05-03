package models.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "USEID")
    private Integer useId;

    @Size(max = 100)
    @Column(name = "USEGIVENNAMES")
    @NotEmpty
    private String useGivenNames;

    @Size(max = 100)
    @Column(name = "USESURNAMES")
    @NotEmpty
    private String useSurnames;

    @Size(max = 15)
    @Column(name = "USEPHONE")
    private String usePhone;

    @Size(max = 300)
    @Column(name = "USEAVATAR")
    private String useAvatar;

    @Size(max = 15)
    @Column(name = "USEIDCARD")
    @NotEmpty
    private String useIdCard;

    @Size(max = 30)
    @Column(name = "USEUSERNAME")
    @NotEmpty
    private String useUsername;

    @Size(max = 30)
    @Column(name = "USEPASSWORD")
    @NotEmpty
    private String usePassword;

    @Size(max = 30)
    @Column(name = "USEEMAIL")
    @Email
    @NotEmpty
    private String useEmail;

    @JoinColumn(name = "CITID", referencedColumnName = "CITID")
    @ManyToOne
    private City useCity;

    @OneToMany(mappedBy = "uroUser", fetch = FetchType.LAZY)
    private List<UserRole> userUserRoles;

    public User() {
    }

    public User(Integer useId) {
        this.useId = useId;
    }

    public Integer getUseId() {
        return useId;
    }

    public void setUseId(Integer useId) {
        this.useId = useId;
    }

    public String getUseGivenNames() {
        return useGivenNames;
    }

    public void setUseGivenNames(String useGivenNames) {
        this.useGivenNames = useGivenNames;
    }

    public String getUseSurnames() {
        return useSurnames;
    }

    public void setUseSurnames(String useSurnames) {
        this.useSurnames = useSurnames;
    }

    public String getUsePhone() {
        return usePhone;
    }

    public void setUsePhone(String usePhone) {
        this.usePhone = usePhone;
    }

    public String getUseAvatar() {
        return useAvatar;
    }

    public void setUseAvatar(String useAvatar) {
        this.useAvatar = useAvatar;
    }

    public String getUseIdCard() {
        return useIdCard;
    }

    public void setUseIdCard(String useIdCard) {
        this.useIdCard = useIdCard;
    }

    public String getUseUsername() {
        return useUsername;
    }

    public void setUseUsername(String useUsername) {
        this.useUsername = useUsername;
    }

    public String getUsePassword() {
        return usePassword;
    }

    public void setUsePassword(String usePassword) {
        this.usePassword = usePassword;
    }

    public String getUseEmail() {
        return useEmail;
    }

    public void setUseEmail(String useEmail) {
        this.useEmail = useEmail;
    }

    public City getUseCity() {
        return useCity;
    }

    public void setUseCity(City useCity) {
        this.useCity = useCity;
    }

    public List<UserRole> getUserUserRoles() {
        return userUserRoles;
    }

    public void setUserUserRoles(List<UserRole> userUserRoles) {
        this.userUserRoles = userUserRoles;
    }
}
