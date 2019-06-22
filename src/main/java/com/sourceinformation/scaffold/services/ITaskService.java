package com.sourceinformation.scaffold.services;

import com.sourceinformation.scaffold.entities.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ITaskService {
    Page<Task> findAll(Pageable pageable);
    Task saveTask(Task task);
    Optional<Task> findById(Long id);
}
