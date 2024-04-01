package com.apiAudiovisual.domain.service;

import com.apiAudiovisual.domain.repository.GenreRepository;
import com.apiAudiovisual.domain.service.interfaces.ServiceInterface;
import com.apiAudiovisual.persistence.entity.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements ServiceInterface<Genre> {

    private final GenreRepository genreRepository;

    @Autowired
    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public List<Genre> getAll() {
        return genreRepository.findAll();
    }

    @Override
    public ResponseEntity<Genre> getById(Object id) {
        return null;
    }

    @Override
    public ResponseEntity<Genre> add(Genre genre) {
        genreRepository.save(genre);
        return ResponseEntity.ok(genre);
    }

    @Override
    public ResponseEntity<Genre> update(Object id, Genre genre) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        if (genreRepository.existsById(id)) {
            genreRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
