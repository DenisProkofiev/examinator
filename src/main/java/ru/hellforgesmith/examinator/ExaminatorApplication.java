package ru.hellforgesmith.examinator;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExaminatorApplication extends Application {

	public static void main(String[] args) {
		SpringApplication.run(ExaminatorApplication.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {

	}
}
