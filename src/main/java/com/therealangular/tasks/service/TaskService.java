package com.therealangular.tasks.service;

import com.therealangular.tasks.domain.Task;
import org.springframework.stereotype.Service;


@Service
public interface TaskService {
    Iterable<Task> list();

    Task save(Task task);
}
