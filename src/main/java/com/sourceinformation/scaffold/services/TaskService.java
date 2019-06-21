package com.sourceinformation.scaffold.services;

import com.sourceinformation.scaffold.entities.Task;
import com.sourceinformation.scaffold.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor

@Service
public class TaskService implements ITaskService {

    private final TaskRepository taskRepository;

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.saveAndFlush(task);
    }

    @Override
    public Optional<Task> findById(Long id) {
        return taskRepository.findById(id);
    }
}
