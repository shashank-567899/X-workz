 package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication<Student> implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
    @Autowired
    private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
      
//		Student student1 =new Student("sidd","khot","sid@123");
//		studentRepository.save(student1);
//		
//		Student student2 =new Student("ganu","kote","mhaeshthkhot@12");
//		studentRepository.save(student2);

	}

}
