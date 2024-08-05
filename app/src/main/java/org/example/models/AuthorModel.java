package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The Author class represents an author with personal details.
 * It includes properties for storing the author's ID, first name, last name, email, and age.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "author")
public class AuthorModel {
    /**
     * The unique identifier for the author.
     */
	@Id
	@GeneratedValue
    private Integer id;

    /**
     * The first name of the author.
     */
	@Column
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
