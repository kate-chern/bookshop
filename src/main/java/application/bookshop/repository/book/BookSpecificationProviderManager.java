package application.bookshop.repository.book;

import application.bookshop.exception.EntityNotFoundException;
import application.bookshop.model.Book;
import application.bookshop.repository.SpecificationProvider;
import application.bookshop.repository.SpecificationProviderManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class BookSpecificationProviderManager implements SpecificationProviderManager<Book> {
    private final List<SpecificationProvider<Book>> bookSpecificationProviders;

    @Override
    public SpecificationProvider<Book> getSpecificationProvider(String key) {
        return bookSpecificationProviders.stream()
                .filter(b -> b.getKey().equals(key))
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("Can't find correct specification provider for key" + key));
    }
}
