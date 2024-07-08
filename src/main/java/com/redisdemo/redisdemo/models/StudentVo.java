package com.redisdemo.redisdemo.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", length = 10)
    private long studentId;

    @Column(name = "name")
    private String name;

    @Column(name = "age", length = 3)
    private int age;

}
