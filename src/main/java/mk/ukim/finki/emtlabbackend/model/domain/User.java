//package mk.ukim.finki.emtlabbackend.model.domain;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@Table(name = "users")
//public class User extends BaseAuditableEntity {
//    @Column(nullable = false)
//    private String name;
//
//    @Column(nullable = false)
//    private String surname;
//
//    @Column(nullable = false, unique = true)
//    private String email;
//
//
//
//
//
//    public User(String name, String surname, String email) {
//        this.name = name;
//        this.surname = surname;
//        this.email = email;
//    }
//}