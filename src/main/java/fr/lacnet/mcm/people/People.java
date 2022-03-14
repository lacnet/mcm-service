package fr.lacnet.mcm.people;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

@Data
public class People {
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
