package com.apiAudiovisual.domain.repository;

import com.apiAudiovisual.persistence.entity.Platform;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatformRepository extends JpaRepository<Platform, Long> {
}
