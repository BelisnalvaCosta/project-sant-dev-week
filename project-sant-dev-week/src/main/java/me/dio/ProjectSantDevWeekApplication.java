package me.dio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Initializes our RESTful API.
 *
 * <p>
 * The {@link OpenAPIDefinition} annotation was used to enable HTTPS in the Swagger UI.
 * For more details, see the following post on Stack Overflow:
 * https://stackoverflow.com/a/71132608/3072570
 * </p>
 */

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class ProjectSantDevWeekApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSantDevWeekApplication.class, args);
	}

}
