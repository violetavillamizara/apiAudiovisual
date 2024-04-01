package com.apiAudiovisual.web.controller;

import com.apiAudiovisual.domain.service.ContentTypeServiceImpl;
import com.apiAudiovisual.persistence.entity.Admin;
import com.apiAudiovisual.persistence.entity.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/contentype")
public class ContentTypeController {
    private final ContentTypeServiceImpl contentTypeService;

    @Autowired
    public ContentTypeController(ContentTypeServiceImpl contentTypeService) {
        this.contentTypeService = contentTypeService;
    }

    @GetMapping
    public List<ContentType> getAll(){
        return contentTypeService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContentType> getById(@PathVariable Object id) {
        return contentTypeService.getById(id);
    }

    @PostMapping
    public ResponseEntity<ContentType> add(@RequestBody ContentType adminSave) {
        return contentTypeService.add(adminSave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return contentTypeService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContentType> update( @PathVariable Object id, @RequestBody ContentType contentTypeUpdate) {
        return contentTypeService.update(id, contentTypeUpdate);
    }

}
