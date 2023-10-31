package com.javatpoint.server.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.model.Marks;
import com.javatpoint.server.main.model.Students;
import com.javatpoint.server.main.repository.MarksRepository;
import com.javatpoint.server.main.repository.StudentsRepository;

@RestController
public class StudentsController {
	private StudentsRepository studentsRepository;
	private MarksRepository marksRepository;
		
	public StudentsController(StudentsRepository studentsRepository,MarksRepository marksRepository) {
		super();
		this.studentsRepository = studentsRepository;
		this.marksRepository=marksRepository;
	}


	@PostMapping("/students/create")
	public Students createStudents(@RequestBody Students student)
	{
		return studentsRepository.save(student);
		
	}

	
	@DeleteMapping("students/delete/{id}")
	public ResponseEntity<?> deleteStudents(@PathVariable int id)
	{
		Optional<Students> findById = studentsRepository.findById(id);
		studentsRepository.delete(findById.get());
		return ResponseEntity.ok().body("deleted successfully");
	}
	
	@DeleteMapping("students/delete/all")
	public ResponseEntity<?>deleteAllStudents(@RequestBody Students students)
	{
		studentsRepository.deleteAll();
		return ResponseEntity.ok().body("all students are deleted");
		
	}
	
	
	@GetMapping("/students/get/{id}")
	public Students getStudent(@PathVariable int id)
	{
		return studentsRepository.findById(id).get();
	}
	
	@GetMapping("/students/get")
	public List<Students>getStudents()
	{
		return studentsRepository.findAll();
	}
	
	@PutMapping("/students/update/{id}")
	public ResponseEntity<?> updateStudents(@RequestBody Students stu,@PathVariable int id)
	{
		Students studs=studentsRepository.findById(id).get();
		studs.setName(stu.getName());
		Marks marks=marksRepository.findById(id).get();
		marks.setTamil(stu.getMarks().getTamil());
		marks.setEnglish(stu.getMarks().getEnglish());
		marks.setMaths(stu.getMarks().getMaths());
		marks.setTotal(stu.getMarks().getTotal());
		Marks savedMark=marksRepository.save(marks);
		studs.setMarks(savedMark);
		Students savedStudents=studentsRepository.save(studs);
		return ResponseEntity.ok().body("Updated successfully");
	
		
	}
	@GetMapping("/students/marks/get/{id}")
	public Marks getMarks(@PathVariable int id)
	{
		return marksRepository.findById(id).get();
	}
	
	@GetMapping("/students/marks/get")
	public List<Marks>getMarks()
	{
		return marksRepository.findAll();
	}
}
