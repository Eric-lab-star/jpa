package org.example.respositories;

import org.example.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author
 */
public interface AuthorRespository extends JpaRepository<AuthorModel, Integer> {

	
}
