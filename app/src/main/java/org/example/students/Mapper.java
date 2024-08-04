package org.example.students;

import org.springframework.stereotype.Service;

/**
 * Service
 */
@Service
public class Mapper{

	public ResponseDto convert(
		Student std
	){
		return new ResponseDto(
			std.getId(),
			std.getName()
		);
	}
}
