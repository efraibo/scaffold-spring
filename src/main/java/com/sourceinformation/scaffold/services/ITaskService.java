package com.sourceinformation.scaffold.services;

import com.sourceinformation.scaffold.entities.Task;

import java.util.List;
import java.util.Optional;

public interface ITaskService {
    List<Task> findAll();
    Task saveTask(Task task);
    Optional<Task> findById(Long id);
}
