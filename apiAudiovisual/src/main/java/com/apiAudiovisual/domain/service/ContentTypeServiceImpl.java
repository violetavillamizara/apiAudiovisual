package com.apiAudiovisual.domain.service;

import com.apiAudiovisual.domain.repository.ContentTypeRepository;
import com.apiAudiovisual.domain.service.interfaces.ServiceInterface;
import com.apiAudiovisual.persistence.entity.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentTypeServiceImpl implements ServiceInterface<ContentType> {

    private final ContentTypeRepository contentTypeRepository;

    @Autowired
    public ContentTypeServiceImpl(ContentTypeRepository contentTypeRepository) {
        this.contentTypeRepository = contentTypeRepository;
    }

    @Override
    public List<ContentType> getAll() {
        return contentTypeRepository.findAll();
    }

    @Override
    public ResponseEntity<ContentType> getById(Object id) {
        return null;
    }

    @Override
    public ResponseEntity<ContentType> add(ContentType contentType) {
        contentTypeRepository.save(contentType);
        return ResponseEntity.ok(contentType);
    }

    @Override
    public ResponseEntity<ContentType> update(Object id, ContentType contentType) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        if (contentTypeRepository.existsById(id)) {
            contentTypeRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
