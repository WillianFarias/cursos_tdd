package br.com.estudos.tdd.modules.course.service;

import org.springframework.stereotype.Service;

import br.com.estudos.tdd.modules.course.entite.Course;
import br.com.estudos.tdd.modules.course.repository.ICourseRepository;

@Service
public class CreateCourseService {
	
	private ICourseRepository repository;
	
	public CreateCourseService(ICourseRepository repository) {
		this.repository = repository;
	}
	
	public Course execute(Course course) {
		
		Course courseExisted = this.repository.findByName(course.getName());
		
		if (courseExisted != null)
			throw new Error("Curso já existe");
		
		return repository.save(course);
	}

}
