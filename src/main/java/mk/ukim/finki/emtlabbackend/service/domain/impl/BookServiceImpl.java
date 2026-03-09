package mk.ukim.finki.emtlabbackend.service.domain.impl;


import mk.ukim.finki.emtlabbackend.model.domain.Book;
import mk.ukim.finki.emtlabbackend.model.domain.BookState;
import mk.ukim.finki.emtlabbackend.model.exception.BookNotAvailableException;
import mk.ukim.finki.emtlabbackend.repository.BookRepository;
import mk.ukim.finki.emtlabbackend.service.domain.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book create(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Optional<Book> update(Long id, Book book) {
        return bookRepository.findById(id)
                .map((existingBook)->{
                    existingBook.setName(book.getName());
                    existingBook.setAuthor(book.getAuthor());
                    existingBook.setBookState(book.getBookState());
                    existingBook.setCategory(book.getCategory());
                    existingBook.setAvailableCopies(book.getAvailableCopies());
                    return bookRepository.save(existingBook);
                });
    }

    @Override
    public Optional<Book> deleteById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        book.ifPresent(bookRepository::delete);
        return book;
    }
    @Override
    public Optional<Book> markAsRented(Long id) {
        return bookRepository.findById(id)
                .map(book->{
                    if (book.getBookState() == BookState.BAD) {
                        throw new BookNotAvailableException("Book is in bad state");
                    }

                    if (book.getAvailableCopies() <= 0) {
                        throw new BookNotAvailableException("No available copies left");
                    }
                   book.setAvailableCopies(book.getAvailableCopies()-1);
                   return bookRepository.save(book);
                });
    }
}
