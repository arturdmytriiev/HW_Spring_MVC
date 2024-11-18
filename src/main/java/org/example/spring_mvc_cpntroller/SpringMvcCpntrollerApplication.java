package org.example.spring_mvc_cpntroller;

import org.example.spring_mvc_cpntroller.model.Note;
import org.example.spring_mvc_cpntroller.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcCpntrollerApplication implements CommandLineRunner {
	@Autowired
	NoteService noteService;

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcCpntrollerApplication.class, args);
	}
	@Override
	public void  run (String... args) throws Exception {
		noteService.add(new Note(null, "Title 1", "Content 1"));
		noteService.add(new Note(null, "Title 2", "Content 2"));
	}
}
