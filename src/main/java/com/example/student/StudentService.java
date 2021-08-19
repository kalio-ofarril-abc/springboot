package com.example.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public List<Student> getAllStudents(){
		return Arrays.asList(
				new Student(
				1L,
				"Kalio",
				"kalio.ofvil@gmail.com",
				LocalDate.of(1993, 	Month.OCTOBER, 8),
				27
				)
			);
	}

}
