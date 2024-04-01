package com.apiAudiovisual.domain.repository;

import com.apiAudiovisual.persistence.entity.ContentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentTypeRepository extends JpaRepository<ContentType, Long> {
}
