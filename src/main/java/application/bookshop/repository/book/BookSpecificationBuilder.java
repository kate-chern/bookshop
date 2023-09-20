package application.bookshop.repository.book;

import application.bookshop.dto.bookdto.BookSearchParametersDto;
import application.bookshop.model.Book;
import application.bookshop.repository.SpecificationBuilder;
import application.bookshop.repository.SpecificationProviderManager;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class BookSpecificationBuilder implements SpecificationBuilder<Book> {
    private SpecificationProviderManager<Book> specificationProviderManager;

    @Override
    public Specification<Book> build(BookSearchParametersDto bookSearchParametersDto) {
        Specification<Book> spec = Specification.where(null);
        if (bookSearchParametersDto.getAuthors() != null
                && bookSearchParametersDto.getAuthors().length > 0) {
            spec = spec.and(specificationProviderManager
                    .getSpecificationProvider("author")
                    .getSpecification(bookSearchParametersDto.getAuthors()));
        }
        if (bookSearchParametersDto.getTitles() != null
                && bookSearchParametersDto.getTitles().length > 0) {
            spec = spec.and(specificationProviderManager
                    .getSpecificationProvider("title")
                    .getSpecification(bookSearchParametersDto.getTitles()));
        }
        return spec;
    }
}
