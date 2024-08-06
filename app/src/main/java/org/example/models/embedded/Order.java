package org.example.models.embedded;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Order
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="_order")
public class Order{

	@EmbeddedId
	private OrderId id;

	@Embedded
	private Address address;
	private String OrderInfo;
	private String anotherField;
}
