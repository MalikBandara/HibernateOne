package lk.ijse.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

//ID Attribute
@Id
@Column(name = "id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;


@Column(name = "address" , nullable = false)
private String address;

}
