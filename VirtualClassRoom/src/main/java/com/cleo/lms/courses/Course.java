package com.cleo.lms.courses;

import com.cleo.lms.users.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Import;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Course {
    @Id
    @GeneratedValue private Long id;

    private String courseName;

    private Integer semester_offered;

    private Integer capacity;

    private Boolean is_current;

    @Enumerated(EnumType.STRING)
    private CourseCategory courseCategory;

    enum CourseCategory{
        ENGINEERING,FINANCE,ARTS,HUMANITIES
    }


    //private Professor professor;








}