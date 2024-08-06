
package org.example.models;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Resource Model
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Inheritance
@DiscriminatorColumn(name = "resource_type")
@Table(name = "resource")
public class ResourceModel extends BaseEntity{
	
	private String name;
	private int size;
	private String url;

	@OneToOne
	@JoinColumn( name = "lecture_id")
	private LectureModel lecture;
}
