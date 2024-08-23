package br.com.floresdev.fipe_table;

import br.com.floresdev.fipe_table.application.UserInterface;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FipeTableApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FipeTableApplication.class, args);
	}

	@Override
	public void run(String... args) {
		UserInterface userInterface = new UserInterface();
		userInterface.start();
	}
}
