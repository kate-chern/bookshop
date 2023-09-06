package application.bookshop;

import application.bookshop.model.Book;
import application.bookshop.service.BookService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookshopApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookshopApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book book = new Book();
            book.setAuthor("Cronin A.J.");
            book.setTitle("The Citadel");
            book.setCoverImage("Image of Doctor with book");
            book.setIsbn("12345");
            book.setDescription("Story about doctor Andrew Manson how he discovered "
                    + "unpleasant facts about medicine");
            book.setPrice(BigDecimal.valueOf(47));

            bookService.save(book);

            System.out.println(bookService.findAll());

        };
    }

}
