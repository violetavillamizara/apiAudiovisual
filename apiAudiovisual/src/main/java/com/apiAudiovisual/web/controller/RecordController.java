package com.apiAudiovisual.web.controller;

import com.apiAudiovisual.domain.service.ContentTypeServiceImpl;
import com.apiAudiovisual.domain.service.RecordServiceImpl;
import com.apiAudiovisual.persistence.entity.ContentType;
import com.apiAudiovisual.persistence.entity.MediaRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/mediarecord")
public class RecordController {
    private final RecordServiceImpl recordService;

    @Autowired
    public RecordController(RecordServiceImpl recordService) {
        this.recordService = recordService;
    }

    @GetMapping
    public List<MediaRecord> getAll(){
        return recordService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MediaRecord> getById(@PathVariable Object id) {
        return recordService.getById(id);
    }

    @PostMapping
    public ResponseEntity<MediaRecord> add(@RequestBody MediaRecord adminSave) {
        return recordService.add(adminSave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return recordService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MediaRecord> update( @PathVariable Object id, @RequestBody MediaRecord contentTypeUpdate) {
        return recordService.update(id, contentTypeUpdate);
    }

}
