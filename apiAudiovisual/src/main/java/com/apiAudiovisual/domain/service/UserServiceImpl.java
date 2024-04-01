package com.apiAudiovisual.domain.service;

import com.apiAudiovisual.domain.repository.UserRepository;
import com.apiAudiovisual.domain.service.interfaces.ServiceInterface;
import com.apiAudiovisual.persistence.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements ServiceInterface<Person> {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Person> getAll() {
        return userRepository.findAll();
    }

    @Override
    public ResponseEntity<Person> getById(Object id) {
        return null;
    }

    @Override
    public ResponseEntity<Person> add(Person user) {
        userRepository.save(user);
        return ResponseEntity.ok(user);
    }

    @Override
    public ResponseEntity<Person> update(Object id, Person user) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
