package org.example.students;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Contorller
 */
@RestController
public class Controller {
	private final Repository repository;
	private final Mapper mapper;

	public Controller(
		Repository repository,
		Mapper mapper
	){
		this.repository = repository;
		this.mapper = mapper;
	}


	@PostMapping("/students")
	public ResponseDto postStudent(
		@RequestBody Student std
	){
		Student saved = repository.save(std);
		return mapper.convert(saved);
	}

	@GetMapping("/students")
	public List<ResponseDto> getStudents(
	){
		List<Student> list = repository.findAll();
		List<ResponseDto> dtoList = list
									.stream()
									.map(mapper::convert)
									.collect(Collectors
									.toList());
		return dtoList;
	}
}
