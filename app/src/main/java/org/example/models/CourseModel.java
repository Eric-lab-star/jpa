package org.example.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
/**
 * CourseModel
 */

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "course")
public class CourseModel extends BaseEntity {
	private String name;
	private String description;
	
	@ManyToMany
	@JoinTable(
		name = "course_author",
		joinColumns = {@JoinColumn(name = "course_id") },
		inverseJoinColumns = {@JoinColumn(name  = "author_id") }
	)
	private List<AuthorModel> authors;

	@OneToMany(
		mappedBy = "course"
	)
	private List<SectionModel> sections;
}
