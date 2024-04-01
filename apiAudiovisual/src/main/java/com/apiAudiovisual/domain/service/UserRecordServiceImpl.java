package com.apiAudiovisual.domain.service;

import com.apiAudiovisual.domain.repository.UserRecordRepository;
import com.apiAudiovisual.domain.service.interfaces.ServiceInterface;
import com.apiAudiovisual.persistence.entity.UserRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRecordServiceImpl implements ServiceInterface<UserRecord> {

    private final UserRecordRepository userRecordRepository;

    @Autowired
    public UserRecordServiceImpl(UserRecordRepository userRecordRepository) {
        this.userRecordRepository = userRecordRepository;
    }

    @Override
    public List<UserRecord> getAll() {
        return userRecordRepository.findAll();
    }

    @Override
    public ResponseEntity<UserRecord> getById(Object id) {
        return null;
    }

    @Override
    public ResponseEntity<UserRecord> add(UserRecord userRecord) {
        userRecordRepository.save(userRecord);
        return ResponseEntity.ok(userRecord);
    }

    @Override
    public ResponseEntity<UserRecord> update(Object id, UserRecord userRecord) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        if (userRecordRepository.existsById(id)) {
            userRecordRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
