package com.kodilla.library;

import com.kodilla.library.domain.reader.ReaderDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.time.LocalDate;

@SpringBootApplication
public class KodillaLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodillaLibraryApplication.class, args);
	}
}
