package org.example.models.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Address
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable // --> allows this entity to be used as property for other entity
public class Address {

	private String streetName;
	private String houseNumber;
	private String zipCode;
}
