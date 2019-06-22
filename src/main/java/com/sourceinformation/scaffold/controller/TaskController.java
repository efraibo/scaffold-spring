package com.sourceinformation.scaffold.controller;

import com.sourceinformation.scaffold.dto.TaskDTO;
import com.sourceinformation.scaffold.entities.Task;
import com.sourceinformation.scaffold.mapper.TaskMapper;
import com.sourceinformation.scaffold.services.ITaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequiredArgsConstructor

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskService service;

    private final TaskMapper mapper;


    @GetMapping
    public ResponseEntity<Page<TaskDTO>> findAll(Pageable pageable) {
        return new ResponseEntity<>(service.findAll(pageable).map(mapper::domainToDto), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TaskDTO> saveTask(@RequestBody TaskDTO dto) {
        Task task = mapper.dtoToDomain(dto);
        return new ResponseEntity<>(mapper.domainToDto(service.saveTask(task)), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Task>> findById(@PathVariable Long id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }
}
