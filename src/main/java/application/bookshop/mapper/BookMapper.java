package application.bookshop.mapper;

import application.bookshop.config.MapperConfig;
import application.bookshop.dto.bookdto.BookDto;
import application.bookshop.dto.bookdto.CreateBookRequestDto;
import application.bookshop.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    @Mapping(target = "id", ignore = true)
    Book toModel(CreateBookRequestDto requestDto);
}
