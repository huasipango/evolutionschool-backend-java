package models.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="FATHER")
public class Father extends User implements Serializable {

    @Min(value = 1)
    @Column(name = "FATCHILDRENCOUNT")
    @NotEmpty
    private Integer fatChildrenCount;

    @OneToMany(mappedBy = "stuFather", fetch = FetchType.LAZY)
    private List<Student> fatStudents;

    public Father() {
    }

    public Father(Integer useId) {
        super(useId);
    }

    public Integer getFatChildrenCount() {
        return fatChildrenCount;
    }

    public void setFatChildrenCount(Integer fatChildrenCount) {
        this.fatChildrenCount = fatChildrenCount;
    }

    public List<Student> getFatStudents() {
        return fatStudents;
    }

    public void setFatStudents(List<Student> fatStudents) {
        this.fatStudents = fatStudents;
    }
}
