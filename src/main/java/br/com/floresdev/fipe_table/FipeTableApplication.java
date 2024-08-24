package br.com.floresdev.fipe_table;

import br.com.floresdev.fipe_table.application.UserInteraction;
import br.com.floresdev.fipe_table.application.UserInterface;
import br.com.floresdev.fipe_table.services.AutomotiveService;
import br.com.floresdev.fipe_table.services.DisplayService;
import br.com.floresdev.fipe_table.utils.AutomotiveUrlBuilder;
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
		UserInterface userInterface = new UserInterface(
				new DisplayService(), new UserInteraction(), new AutomotiveService(), new AutomotiveUrlBuilder()
		);
		userInterface.start();
	}
}
