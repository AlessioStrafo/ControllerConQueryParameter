//Scrivi una applicazione web Spring Boot che alla
// endpoint GET v1/ciao?nome=Giuseppe&provincia=Lombardia risponde con
// "Ciao Giuseppe, com'è il tempo in Lombardia?"

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
