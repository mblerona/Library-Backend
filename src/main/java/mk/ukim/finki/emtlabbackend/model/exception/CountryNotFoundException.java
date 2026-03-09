package mk.ukim.finki.emtlabbackend.model.exception;

public class CountryNotFoundException extends RuntimeException {
    public CountryNotFoundException(Long id) {
        super("A Country with id %d does not exist.".formatted(id));
    }
}
