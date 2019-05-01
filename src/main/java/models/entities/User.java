package models.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

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


}
