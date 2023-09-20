package application.bookshop.dto.bookdto;

import lombok.Data;

@Data
public class BookSearchParametersDto {
    private String[] titles;
    private String[] authors;
}
