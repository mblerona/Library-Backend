package mk.ukim.finki.emtlabbackend.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import mk.ukim.finki.emtlabbackend.model.domain.Author;
import mk.ukim.finki.emtlabbackend.model.domain.Book;
import mk.ukim.finki.emtlabbackend.model.domain.BookState;
import mk.ukim.finki.emtlabbackend.model.domain.Category;

public record CreateBookDto(
        @NotBlank(message = "A name is required.")
        String name,
        @NotNull(message = "A category for the book is required.")
        Category category,
        @NotNull(message = "An author is required.")
        Long authorId,
        @NotNull(message = "Enter the book state")
        BookState state,
        @NotNull
        @Min(0)
        Integer availableCopies
) {
    public Book toBook(Author author){
        return new Book(name,availableCopies,state,category,author);
    }
}
