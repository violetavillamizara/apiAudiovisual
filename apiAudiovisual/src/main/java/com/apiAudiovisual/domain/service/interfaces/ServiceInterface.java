package com.apiAudiovisual.domain.service.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceInterface<T> {
    List<T> getAll();
    ResponseEntity<T> getById(Object id);
    ResponseEntity<T> add(T t);
    ResponseEntity<T> update(Object id, T t);
    ResponseEntity<Void> delete(Long id);
}
