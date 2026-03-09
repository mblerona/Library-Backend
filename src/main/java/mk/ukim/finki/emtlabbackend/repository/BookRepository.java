package mk.ukim.finki.emtlabbackend.repository;


import mk.ukim.finki.emtlabbackend.model.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

}
