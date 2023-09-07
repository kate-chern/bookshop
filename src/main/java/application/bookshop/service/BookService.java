package application.bookshop.service;

import application.bookshop.dto.BookDto;
import application.bookshop.dto.CreateBookRequestDto;
import java.util.List;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    BookDto findById(Long id);

    List<BookDto> findAll();
}
