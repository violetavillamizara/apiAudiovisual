package com.apiAudiovisual.domain.service;

import com.apiAudiovisual.domain.repository.PlatformRepository;
import com.apiAudiovisual.domain.service.interfaces.ServiceInterface;
import com.apiAudiovisual.persistence.entity.Platform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatformServiceImpl implements ServiceInterface<Platform> {
    private final PlatformRepository platformRepository;

    @Autowired
    public PlatformServiceImpl(PlatformRepository platformRepository) {
        this.platformRepository = platformRepository;
    }

    @Override
    public List<Platform> getAll() {
        return platformRepository.findAll();
    }

    @Override
    public ResponseEntity<Platform> getById(Object id) {
        return null;
    }

    @Override
    public ResponseEntity<Platform> add(Platform platform) {
        platformRepository.save(platform);
        return ResponseEntity.ok(platform);
    }

    @Override
    public ResponseEntity<Platform> update(Object id, Platform platform) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        if (platformRepository.existsById(id)) {
            platformRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
