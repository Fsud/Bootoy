package io.github.sudden.Bootoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootoyApplication {

	public static void main(String[] args) {
		System.out.println("master");
		SpringApplication.run(BootoyApplication.class, args);
	}
}
