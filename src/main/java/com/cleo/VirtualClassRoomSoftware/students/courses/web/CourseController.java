package com.cleo.VirtualClassRoomSoftware.students.courses.web;

import com.cleo.VirtualClassRoomSoftware.students.courses.services.CourseService;
import com.cleo.VirtualClassRoomSoftware.students.courses.dto.CourseDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping("/create")
    public ResponseEntity<CourseDTO> createCourse(@RequestBody CourseDTO courseDTO){
        CourseDTO savedCourse = courseService.createCourse(courseDTO);
        return new ResponseEntity<>(savedCourse, HttpStatus.CREATED);

    }
    @GetMapping("/{id}")
    public ResponseEntity<CourseDTO> getCourseById(@PathVariable  Long id){
        CourseDTO courseDTO = courseService.getCourseByID(id);
        return ResponseEntity.ok(courseDTO);

    }
    @GetMapping("/all")
    public ResponseEntity<List<CourseDTO>> getAllCourses(){
        var courses = courseService.getAllCourses();
        return ResponseEntity.ok(courses);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<CourseDTO> updateCourse(@PathVariable Long id, @RequestBody CourseDTO courseDTO){
      CourseDTO updated_course=  courseService.updateCourse(id,courseDTO);
      return ResponseEntity.ok(updated_course);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String > deleteCourse(@PathVariable Long id){
        courseService.deleteCourse(id);
        return ResponseEntity.ok("Course with id" + id + " was deleted");
    }
}
