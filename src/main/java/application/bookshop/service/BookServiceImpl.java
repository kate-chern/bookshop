package application.bookshop.service;

import application.bookshop.dto.BookDto;
import application.bookshop.dto.CreateBookRequestDto;
import application.bookshop.exception.EntityNotFoundException;
import application.bookshop.mapper.BookMapper;
import application.bookshop.model.Book;
import application.bookshop.repository.BookRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookDto save(CreateBookRequestDto requestDto) {
        Book book = bookMapper.toModel(requestDto);
        return bookMapper.toDto(bookRepository.save(book));
    }

    @Override
    public BookDto findById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Can't find book by id" + id)
        );
        return bookMapper.toDto(book);
    }

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll().stream()
                .map(bookMapper::toDto)
                .toList();
    }
}
