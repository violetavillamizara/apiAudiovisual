package com.apiAudiovisual.web.controller;

import com.apiAudiovisual.domain.service.RecordServiceImpl;
import com.apiAudiovisual.domain.service.UserRecordServiceImpl;
import com.apiAudiovisual.domain.service.UserServiceImpl;
import com.apiAudiovisual.persistence.entity.MediaRecord;
import com.apiAudiovisual.persistence.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/userperson")
public class UserController {
    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<Person> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getById(@PathVariable Object id) {
        return userService.getById(id);
    }

    @PostMapping
    public ResponseEntity<Person> add(@RequestBody Person adminSave) {
        return userService.add(adminSave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return userService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> update( @PathVariable Object id, @RequestBody Person contentTypeUpdate) {
        return userService.update(id, contentTypeUpdate);
    }

}