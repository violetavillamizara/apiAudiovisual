package com.apiAudiovisual.domain.repository;

import com.apiAudiovisual.persistence.entity.UserRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRecordRepository extends JpaRepository<UserRecord, Long> {
}
