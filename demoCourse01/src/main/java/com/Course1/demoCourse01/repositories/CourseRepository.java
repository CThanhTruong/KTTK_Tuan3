package com.Course1.demoCourse01.repositories;

import com.Course1.demoCourse01.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
