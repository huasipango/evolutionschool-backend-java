package models.entities;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Father {

    @Min(value = 1)
    @Column(name = "FATCHILDRENCOUNT")
    @NotEmpty
    private Integer fatChildrenCount;
}
