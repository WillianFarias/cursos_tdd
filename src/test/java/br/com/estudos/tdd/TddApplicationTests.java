package br.com.estudos.tdd;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.estudos.tdd.modules.course.entite.Course;
import br.com.estudos.tdd.modules.course.repository.CourseInMemoryRepository;
import br.com.estudos.tdd.modules.course.service.CreateCourseService;

@SpringBootTest
class TddApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void should_be_able_to_create_a_new_course() {
		Course course = new Course();
		course.setDescription("Curso_Description_Test");
		course.setName("Curso_name");
		course.setWorkload(100);
		
		CourseInMemoryRepository repository = new CourseInMemoryRepository();
		
		CreateCourseService createCourseService = new CreateCourseService(repository);
		Course courseCreated = createCourseService.execute(course);
		
		assertNotNull(courseCreated.getId());
	}

}
