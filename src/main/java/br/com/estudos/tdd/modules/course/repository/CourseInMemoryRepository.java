package br.com.estudos.tdd.modules.course.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import br.com.estudos.tdd.modules.course.entite.Course;

public class CourseInMemoryRepository implements ICourseRepository {

	private List<Course> courses;

	@Override
	public Course findByName(String name) {
		Optional<Course> optionalCourse = this.courses.stream().filter(course -> course.getName().equals(name))
				.findFirst();
		return optionalCourse.orElse(null);
	}

	@Override
	public Course save(Course course) {
		course.setId(UUID.randomUUID());
		courses.add(course);
		return course;
	}

}
