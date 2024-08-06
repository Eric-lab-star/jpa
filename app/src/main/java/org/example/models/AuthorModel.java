package org.example.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


/**
 * The Author class represents an author with personal details.
 * It includes properties for storing the author's ID, first name, last name, email, and age.
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "author")
public class AuthorModel extends BaseEntity {

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

	@ManyToMany(
		mappedBy = "authors"
	)
	private List<CourseModel> courses;


}
