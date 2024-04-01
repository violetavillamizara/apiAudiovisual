package com.apiAudiovisual.domain.service;

import com.apiAudiovisual.domain.repository.RecordRepository;
import com.apiAudiovisual.domain.service.interfaces.ServiceInterface;
import com.apiAudiovisual.persistence.entity.MediaRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements ServiceInterface<MediaRecord> {

    private final RecordRepository recordRepository;

    @Autowired
    public RecordServiceImpl(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }


    @Override
    public List<MediaRecord> getAll() {
        return recordRepository.findAll();
    }

    @Override
    public ResponseEntity<MediaRecord> getById(Object id) {
        return null;
    }

    @Override
    public ResponseEntity<MediaRecord> add(MediaRecord mediaRecord) {
        recordRepository.save(mediaRecord);
        return ResponseEntity.ok(mediaRecord);
    }

    @Override
    public ResponseEntity<MediaRecord> update(Object id, MediaRecord mediaRecord) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        if (recordRepository.existsById(id)) {
            recordRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
