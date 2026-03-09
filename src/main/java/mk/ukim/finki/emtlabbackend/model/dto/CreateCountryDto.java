package mk.ukim.finki.emtlabbackend.model.dto;

import jakarta.validation.constraints.NotBlank;
import mk.ukim.finki.emtlabbackend.model.domain.Author;
import mk.ukim.finki.emtlabbackend.model.domain.Book;
import mk.ukim.finki.emtlabbackend.model.domain.Country;

public record CreateCountryDto(
        @NotBlank(message = "A country name is required.")
        String name,
        @NotBlank(message = "A continent is required.")
        String continent

) {
    public Country toCountry(){
        return new Country(name,continent);
    }
}
