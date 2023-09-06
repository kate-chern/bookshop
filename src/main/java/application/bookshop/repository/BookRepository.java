package application.bookshop.repository;

import application.bookshop.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List findAll();
}
