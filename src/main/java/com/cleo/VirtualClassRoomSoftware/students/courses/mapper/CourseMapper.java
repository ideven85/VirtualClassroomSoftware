package com.cleo.VirtualClassRoomSoftware.students.courses.mapper;

import com.cleo.VirtualClassRoomSoftware.students.courses.domain.Course;
import com.cleo.VirtualClassRoomSoftware.students.courses.dto.CourseDTO;

public class CourseMapper {

    public static CourseDTO mapToCourseDTO(Course course){
        return new CourseDTO(
                course.getId(),
                course.getFeatures(),
                course.getCourse_name(),
                course.getTeacher(),
                course.getDuration(),
                course.getStart_date(),
                course.getEnd_date()

        );
    }
    public static Course mapToCourse(CourseDTO courseDTO){
        return new Course(
                courseDTO.getId(),
                courseDTO.getFeatures(),
                courseDTO.getCourse_name(),
                courseDTO.getTeacher(),
                courseDTO.getDuration(),
                courseDTO.getStart_date(),
                courseDTO.getEnd_date()
        );
    }
}
