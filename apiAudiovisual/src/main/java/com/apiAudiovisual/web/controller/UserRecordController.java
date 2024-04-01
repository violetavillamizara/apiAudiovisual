package com.apiAudiovisual.web.controller;

import com.apiAudiovisual.domain.service.UserRecordServiceImpl;
import com.apiAudiovisual.persistence.entity.UserRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/userecord")
public class UserRecordController {

    private final UserRecordServiceImpl userRecordService;

    @Autowired
    public UserRecordController(UserRecordServiceImpl userRecordService) {
        this.userRecordService = userRecordService;
    }

    @GetMapping
    public List<UserRecord> getAll(){
        return userRecordService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserRecord> getById(@PathVariable Object id) {
        return userRecordService.getById(id);
    }

    @PostMapping
    public ResponseEntity<UserRecord> add(@RequestBody UserRecord adminSave) {
        return userRecordService.add(adminSave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return userRecordService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserRecord> update( @PathVariable Object id, @RequestBody UserRecord contentTypeUpdate) {
        return userRecordService.update(id, contentTypeUpdate);
    }

}