package lk.ijse.embeded;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


@Embeddable
public class StudentName {

    @Column(name = "first_name",length = 100,nullable = false)
    private String FirstName;

    @Column(name = "last_name",length = 100,nullable = false)
    private String LastName;


}
