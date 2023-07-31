package com.Course1.demoCourse01.controller;

import com.Course1.demoCourse01.mapper.Mapper;
import com.Course1.demoCourse01.models.Course;
import com.Course1.demoCourse01.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;
    private Jedis jedis = new Jedis();
    private Mapper<Course> mapCourse = new Mapper<>(Course.class);


    @PostMapping("/insert")
    public Course insert(@RequestBody Course course){
        courseRepository.save(course);
        jedis.set(course.getId() + "", mapCourse.Object2Json(course));
        return course;
    }

    @GetMapping("/findById/{id}")
    public Course findById(@PathVariable Long id) {
        Course course = null;
        String json = jedis.get(id + "");
        if(json != null) {
            course = mapCourse.Json2Object(json);
        } else {
            course = courseRepository.findById(id).get();
            jedis.set(course.getId() + "", mapCourse.Object2Json(course));
        }
        return course;
    }

    @GetMapping("/getAll")
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        Optional<Course> course = courseRepository.findById(id);
        if(course.isPresent()) {
            courseRepository.delete(course.get());
            return "delete success";
        }
        return "fail";
    }

    @PutMapping("/update/{id}")
    public Course update(@RequestBody Course courseNew,@PathVariable Long id) {
        Optional<Course> course = courseRepository.findById(id);
        if(course.isPresent()) {
            Course course1 =  course.get();
            courseNew.setId(id);
            course1 = courseNew;
            return courseRepository.save(course1);
        }
        return courseRepository.save(courseNew);
    }
}
