package com.cleo.VirtualClassRoomSoftware.students.courses.domain;

import com.cleo.VirtualClassRoomSoftware.common.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id @GeneratedValue private Long id;


    @Column(name="course_name",nullable = false,unique = true)
    private String course_name;


    private String features;

    private String teacher;



    private int duration;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date start_date;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date end_date;






}
