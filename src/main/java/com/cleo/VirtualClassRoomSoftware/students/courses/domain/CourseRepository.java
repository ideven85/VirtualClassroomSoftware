package com.cleo.VirtualClassRoomSoftware.students.courses.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

    default boolean course__dates(Course course){
        if(course.getStart_date().after(course.getEnd_date())||(course.getStart_date().before(new Date()))){
            System.out.println("Invalid criteria");
            return false;
        }
        return true;
    }

}
