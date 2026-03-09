package mk.ukim.finki.emtlabbackend.model.dto;

import jakarta.validation.constraints.NotBlank;
import mk.ukim.finki.emtlabbackend.model.domain.Author;
import mk.ukim.finki.emtlabbackend.model.domain.Country;

public record CreateAuthorDto(
        @NotBlank(message = "A name is required.")
        String name,
        @NotBlank(message = "A surname is required.")
        String surname,
        @NotBlank(message = "A country is required.")
        Long countryId
) {
    public Author toAuthor(Country country){
        return new Author(name,surname,country);
    }

}
