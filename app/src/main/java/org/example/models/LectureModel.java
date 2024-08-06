package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Lecture Model
 */

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "lecture")
public class LectureModel extends BaseEntity{
	private String name;

	@ManyToOne
	@JoinColumn(name = "section_id")
	private SectionModel section;

	@OneToOne
	@JoinColumn(name = "resource_id")
	private ResourceModel resource;

}
