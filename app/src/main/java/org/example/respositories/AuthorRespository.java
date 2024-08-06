package org.example.respositories;

import java.util.List;

import org.example.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Author
 */
public interface AuthorRespository extends JpaRepository<AuthorModel, Integer> {
	// select * from author where fist_name = $1;
	List<AuthorModel> findAllByFirstName(String firstName);
	// ignore case
	List<AuthorModel> findAllByFirstNameIgnoreCase(String firstName);
	// select * from author where fist_name like = '%$1%';
	List<AuthorModel> findAllByFirstNameContainingIgnoreCase(String firstName);
	//
	List<AuthorModel> findAllByFirstNameStartsWithIgnoreCase(String firstName);
}
