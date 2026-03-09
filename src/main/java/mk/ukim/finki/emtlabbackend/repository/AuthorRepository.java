package mk.ukim.finki.emtlabbackend.repository;


import mk.ukim.finki.emtlabbackend.model.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
