package com.services.ms.student.app;

import com.services.ms.student.app.infrastructure.adapters.output.persistence.entity.StudentEntity;
import com.services.ms.student.app.infrastructure.adapters.output.persistence.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class StudentServiceApplication implements CommandLineRunner {

	private final StudentRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<StudentEntity> entities = Arrays.asList(
			new StudentEntity(null, "Juan", "Perez",28, "Calle 1"),
			new StudentEntity(null, "Harlan", "Enciso",21, "Calle 2"),
			new StudentEntity(null, "Ana", "Ramirez",22, "Calle 3"),
			new StudentEntity(null, "Hola", "Hola",23, "Calle 4")
		);
		repository.saveAll(entities);
	}
}
