package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
	}

}
