package com.apiAudiovisual.domain.repository;

import com.apiAudiovisual.persistence.entity.MediaRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.print.attribute.standard.Media;

@Repository
public interface RecordRepository extends JpaRepository<MediaRecord, Long> {
}
