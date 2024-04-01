package com.apiAudiovisual.web.controller;

import com.apiAudiovisual.domain.service.GenreServiceImpl;
import com.apiAudiovisual.domain.service.RecordServiceImpl;
import com.apiAudiovisual.persistence.entity.Genre;
import com.apiAudiovisual.persistence.entity.MediaRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/genre")
public class GenreController {
    private final GenreServiceImpl genreService;

    @Autowired
    public GenreController(GenreServiceImpl genreService) {
        this.genreService = genreService;
    }

    @GetMapping
    public List<Genre> getAll(){
        return genreService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genre> getById(@PathVariable Object id) {
        return genreService.getById(id);
    }

    @PostMapping
    public ResponseEntity<Genre> add(@RequestBody Genre adminSave) {
        return genreService.add(adminSave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return genreService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Genre> update( @PathVariable Object id, @RequestBody Genre contentTypeUpdate) {
        return genreService.update(id, contentTypeUpdate);
    }

}