package com.cleo.VirtualClassRoomSoftware.students.courses.services;

import com.cleo.VirtualClassRoomSoftware.students.courses.domain.Course;
import com.cleo.VirtualClassRoomSoftware.students.courses.domain.CourseRepository;
import com.cleo.VirtualClassRoomSoftware.students.courses.dto.CourseDTO;
import com.cleo.VirtualClassRoomSoftware.students.courses.exceptions.ResourceNotFoundException;
import com.cleo.VirtualClassRoomSoftware.students.courses.mapper.CourseMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService{

    private final CourseRepository courseRepository;

    @Override
    public CourseDTO createCourse (CourseDTO courseDTO) {
        Course course = CourseMapper.mapToCourse(courseDTO);
        Course savedCourse = courseRepository.save(course);
        return CourseMapper.mapToCourseDTO(savedCourse);
    }

    @Override
    public CourseDTO getCourseByID (Long id) {
        Course course = courseRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Course with given id " + id + " does not exist"));
        return CourseMapper.mapToCourseDTO(course);
    }

    @Override
    public List<CourseDTO> getAllCourses () {
        var courses = courseRepository.findAll();
        return courses.stream()
                .map(CourseMapper::mapToCourseDTO)
                .toList();
    }

    @Override
    public CourseDTO updateCourse (Long id, CourseDTO courseDTO) {
        Course course = courseRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Course with given id: " + id + " does not exist"));
        course.setCourse_name(courseDTO.getCourse_name());
        course.setFeatures(courseDTO.getFeatures());
        course.setTeacher(course.getTeacher());
        course.setDuration(courseDTO.getDuration());
        course.setStart_date(courseDTO.getStart_date());
        course.setEnd_date(courseDTO.getEnd_date());
       Course updated_course= courseRepository.save(course);
        return CourseMapper.mapToCourseDTO(updated_course);
    }

    @Override
    public void deleteCourse (Long id) {
        Course course = courseRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Course with given id: " + id + " does not exist"));
        courseRepository.delete(course);
    }
}
