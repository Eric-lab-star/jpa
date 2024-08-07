package org.example.respositories;

import java.util.List;

import org.example.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;
/**
 * Author
 */
public interface AuthorRespository extends JpaRepository<AuthorModel, Integer>, JpaSpecificationExecutor<AuthorModel> {


	@Modifying
	@Transactional
	@Query("update AuthorModel set age = ?1 where id = ?2")// authormodel should match with name of java entity
	int updateAuthorModel(int age, int id);

	// select * from author where fist_name = $1;
	List<AuthorModel> findAllByFirstName(String firstName);
	// ignore case
	List<AuthorModel> findAllByFirstNameIgnoreCase(String firstName);
	// select * from author where fist_name like = '%$1%';
	List<AuthorModel> findAllByFirstNameContainingIgnoreCase(String firstName);
	//
	List<AuthorModel> findAllByFirstNameStartsWithIgnoreCase(String firstName);
}
