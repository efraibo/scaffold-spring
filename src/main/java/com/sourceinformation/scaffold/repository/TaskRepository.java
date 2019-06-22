package com.sourceinformation.scaffold.repository;

import com.sourceinformation.scaffold.entities.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {
}
