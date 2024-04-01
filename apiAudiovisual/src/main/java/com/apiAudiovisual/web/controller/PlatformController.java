package com.apiAudiovisual.web.controller;

import com.apiAudiovisual.domain.service.PlatformServiceImpl;

import com.apiAudiovisual.persistence.entity.Platform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/platform")
public class PlatformController {
    private final PlatformServiceImpl platformService;

    @Autowired
    public PlatformController(PlatformServiceImpl platformService) {
        this.platformService = platformService;
    }


    @GetMapping
    public List<Platform> getAll(){
        return platformService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Platform> getById(@PathVariable Object id) {
        return platformService.getById(id);
    }

    @PostMapping
    public ResponseEntity<Platform> add(@RequestBody Platform adminSave) {
        return platformService.add(adminSave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return platformService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Platform> update( @PathVariable Object id, @RequestBody Platform contentTypeUpdate) {
        return platformService.update(id, contentTypeUpdate);
    }

}