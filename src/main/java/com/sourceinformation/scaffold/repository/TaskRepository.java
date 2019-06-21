package com.sourceinformation.scaffold.repository;

import com.sourceinformation.scaffold.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
