package mk.ukim.finki.emtlabbackend.service.application;

import mk.ukim.finki.emtlabbackend.model.dto.CreateAuthorDto;
import mk.ukim.finki.emtlabbackend.model.dto.CreateBookDto;
import mk.ukim.finki.emtlabbackend.model.dto.DisplayAuthorDto;
import mk.ukim.finki.emtlabbackend.model.dto.DisplayBookDto;

import java.util.List;
import java.util.Optional;

public interface AuthorApplicationService {
    Optional<DisplayAuthorDto> findById(Long id);

    List<DisplayAuthorDto> findAll();

    DisplayAuthorDto create(CreateAuthorDto createAuthorDto);

    Optional<DisplayAuthorDto> update(Long id, CreateAuthorDto createAuthorDto);

    Optional<DisplayAuthorDto> deleteById(Long id);
}
