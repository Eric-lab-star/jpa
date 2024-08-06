package org.example.models;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * MappedSuperEntity
<ul> 
	<li>id: Integer</li>
	<li> createdAt </li>
	<li>lastModifiedAt</li>
	<li> createdBy </li>
	<li>LastModifiedBy</li>
</ul>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
public class BaseEntity{
	@Id
	@GeneratedValue
	private Integer id;

	private LocalDateTime createdAt;
	private LocalDateTime lastModifiedAt;

	private String createdBy;
	private String lastModifiedBy;
}
