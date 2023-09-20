package application.bookshop.service.book;

import application.bookshop.dto.bookdto.BookDto;
import application.bookshop.dto.bookdto.BookSearchParametersDto;
import application.bookshop.dto.bookdto.CreateBookRequestDto;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    BookDto findById(Long id);

    List<BookDto> findAll(Pageable pageable);

    BookDto update(Long id, CreateBookRequestDto createBookRequestDto);

    void deleteById(Long id);

    List<BookDto> search(BookSearchParametersDto bookSearchParametersDto);
}
