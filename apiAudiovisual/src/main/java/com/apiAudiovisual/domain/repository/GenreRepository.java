package com.apiAudiovisual.domain.repository;

import com.apiAudiovisual.persistence.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
