package fr.lacnet.munchkin;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

@Data
public class Person {
	@Id
	@NonNull
	@com.mongodb.lang.NonNull
	private String id;

	@NonNull
	@com.mongodb.lang.NonNull
	private String firstName;

	@NonNull
	@com.mongodb.lang.NonNull
	private String lastName;
}
