package com.cleo.VirtualClassRoomSoftware.students.courses.services;

import com.cleo.VirtualClassRoomSoftware.students.courses.dto.CourseDTO;

import java.util.List;

public interface CourseService {

    CourseDTO createCourse(CourseDTO courseDTO);
    CourseDTO getCourseByID(Long id);

    List<CourseDTO> getAllCourses();

    CourseDTO updateCourse(Long id, CourseDTO courseDTO);

    void deleteCourse(Long id);
}
