package mk.ukim.finki.emtlabbackend.model.dto;

import mk.ukim.finki.emtlabbackend.model.domain.Book;
import mk.ukim.finki.emtlabbackend.model.domain.BookState;
import mk.ukim.finki.emtlabbackend.model.domain.Category;

import java.util.List;

public record DisplayBookDto(
        Long id,
        String name,
        Category category,
        BookState state,
        Integer availableCopies,
        String authorFullName,
        Long authorId,
        String countryName
) {
    public static DisplayBookDto from(Book book){
        return new DisplayBookDto(
                book.getId(),
                book.getName(),
                book.getCategory(),
                book.getBookState(),
                book.getAvailableCopies(),
                book.getAuthor().getName() + " " + book.getAuthor().getSurname(),
                book.getAuthor().getId(),
                book.getAuthor().getCountry().getName()
        );
    }


    public static List<DisplayBookDto> from(List<Book>books){
        return books
                .stream()
                .map(DisplayBookDto::from)
                .toList();
    }
}
