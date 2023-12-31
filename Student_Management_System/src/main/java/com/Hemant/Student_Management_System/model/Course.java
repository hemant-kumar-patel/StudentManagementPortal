package com.Hemant.Student_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    private String id;
    private String title;
    private String description;
    private String duration;

    @ManyToMany( cascade = CascadeType.ALL)
    Set<Student>studentSet;
}
