package org.example.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
/**
 * Section Model
 */


@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "section")
public class SectionModel extends BaseEntity{
	
	private String name;
	private int sectionOrder;

	@ManyToOne
	@JoinColumn(
		name = "course_id"
	)
	private CourseModel course;

	@OneToMany(
		mappedBy = "section"
	)
	private List<LectureModel> lectures;

}
