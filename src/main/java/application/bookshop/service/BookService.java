package application.bookshop.service;

import application.bookshop.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List findAll();
}
