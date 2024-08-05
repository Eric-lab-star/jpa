package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The Author class represents an author with personal details.
 * It includes properties for storing the author's ID, first name, last name, email, and age.
 */
@Entity
@Data
@NoArgsConstructor
public class Author {

    /**
     * The unique identifier for the author.
     */
	@Id
	@GeneratedValue(
		strategy = GenerationType.IDENTITY
	)
    private Integer id;

    /**
     * The first name of the author.
     */
    private String firstName;

    /**
     * The last name of the author.
     */
    private String lastName;

    /**
     * The email address of the author.
     */
    private String email;

    /**
     * The age of the author.
     */
    private int age;
}
