package mk.ukim.finki.emtlabbackend.model.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="books")
@Getter
@Setter
@NoArgsConstructor
public class Book extends BaseAuditableEntity{

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer availableCopies;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BookState bookState;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "author_id",nullable = false)
    private Author author;


    public Book(String name, Integer availableCopies, BookState bookState, Category category, Author author) {
        this.name = name;
        this.availableCopies = availableCopies;
        this.bookState = bookState;
        this.category = category;
        this.author = author;
    }
}
