package com.cleo.VirtualClassRoomSoftware.students.courses.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    private Long id;

    private String course_name;


    private String features;

    private String teacher;



    private int duration;

    private Date start_date;

    private Date end_date;
}
