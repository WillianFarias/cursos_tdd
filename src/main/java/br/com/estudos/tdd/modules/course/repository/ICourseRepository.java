package br.com.estudos.tdd.modules.course.repository;

import br.com.estudos.tdd.modules.course.entite.Course;

public interface ICourseRepository {

	public Course findByName(String name);

	public Course save(Course course);

}
