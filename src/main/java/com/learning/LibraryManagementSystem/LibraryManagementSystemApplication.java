package com.learning.LibraryManagementSystem;

import com.learning.LibraryManagementSystem.entity.Author;
import com.learning.LibraryManagementSystem.entity.Books;
import com.learning.LibraryManagementSystem.entity.Category;
import com.learning.LibraryManagementSystem.entity.Publisher;
import com.learning.LibraryManagementSystem.repository.BooksRepository;
import com.learning.LibraryManagementSystem.services.BooksServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSystemApplication.class, args);

	}

	@Bean
	public CommandLineRunner initialCreated(BooksServiceImpl booksService,BooksRepository booksRepository){
		return (args) -> {

			// ONLY seed dummy data if the database is currently empty!
			if (booksRepository.count() == 0) {
				Books arthshastra = new Books("ABC", "Arthshastra", "Book on statecraft");
				Author author = new Author("Kautilya", "Teacher of political economy at Takshshila University | Co-Founder of Gupta Empire");
				Category category = new Category("Polotical Economy");
				Publisher penguinClassics = new Publisher("Penguin Classics");
				arthshastra.addAuthors(author);
				arthshastra.addCategory(category);
				arthshastra.addPublisher(penguinClassics);
				booksService.createBook(arthshastra);

				// For the second book in the SAME run, reuse the publisher object
				// so it doesn't try to insert two "Penguin Classics" back-to-back
				Books meditations = new Books("BCD", "Meditations", "Book on philosophy");
				Author marcusAurelias = new Author("Marcus Aurelias", "A king and a philosopher with chaotic mind");
				Category philosophy = new Category("Philosophy");
//                penguinClassics = new Publisher("Penguin Classics");
				meditations.addAuthors(marcusAurelias);
				meditations.addCategory(philosophy);
				meditations.addPublisher(penguinClassics);
				booksService.createBook(meditations);

				Books $12RulesForLife = new Books("EFG", "12 Rules for Life", "Psychology");
				Author jordanPeterson = new Author("Jordan Peterson", "Former professor at University of Toronto");
				Category psychology = new Category("Psychology");
				Publisher penguin = new Publisher("Penguin");
				$12RulesForLife.addAuthors(jordanPeterson);
				$12RulesForLife.addCategory(psychology);
				$12RulesForLife.addPublisher(penguin);
				booksService.createBook($12RulesForLife);
			}
		};
	}

}
