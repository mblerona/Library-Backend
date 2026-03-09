//package mk.ukim.finki.emtlabbackend.repository;
//
//import mk.ukim.finki.emtlabbackend.model.projection.UserProjection;
//
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface UserRepository extends JpaRepository<User, Long> {
//    @Query(value = "select name, surname, email from users", nativeQuery = true)
//    List<UserProjection> findAllWithNameSurnameAndEmail();
//}
