package br.com.estudos.tdd.modules.course.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudos.tdd.modules.course.entite.Course;

public interface CourseJPARepository extends JpaRepository<Course, UUID>{

	Course findByName(String name);
}
