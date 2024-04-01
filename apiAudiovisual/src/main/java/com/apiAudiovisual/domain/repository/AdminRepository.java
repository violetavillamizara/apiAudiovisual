package com.apiAudiovisual.domain.repository;

import com.apiAudiovisual.persistence.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}
