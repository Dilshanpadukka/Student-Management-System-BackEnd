package edu.icet.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String dob;
    private Integer age;
    private String gender;
    private String address;
    private String city;
    private String pinCode;
    private String email;
    private String phone;
    private String qualification;
    private String subStream;

    @Lob
    @Column(name="image",columnDefinition = "LONGBLOB")
    private byte[] image;

}
