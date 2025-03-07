package com.example.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> getStudents() {
		return List.of(new Student(1L, "Bob", "Bob.@example.com", LocalDate.of(2000, 5, 5)));
	}
}
