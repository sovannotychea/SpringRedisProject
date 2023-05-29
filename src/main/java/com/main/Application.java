/**
 * 
 */
package com.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.main.redis.models.Student;
import com.main.redis.repo.StudentRepository;

/**
 * @author sovannoty
 *
 */
@SpringBootApplication
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		// TODO Auto-generated method stub
		Student student = new Student("Eng2015001", "John Doe", Student.Gender.MALE, 1);
		//studentRepository.save(student);

		Student engStudent = new Student("Eng2015002", "John Doe", Student.Gender.MALE, 1);
		Student medStudent = new Student("Med2015001", "Gareth Houston", Student.Gender.MALE, 2);
		//studentRepository.save(engStudent);
		//studentRepository.save(medStudent);

		List<Student> students = new ArrayList<>();
		students = (List<Student>) studentRepository.findAll();
		for (Student stu : students) {
			System.out.println(stu);
		}
	}

}
