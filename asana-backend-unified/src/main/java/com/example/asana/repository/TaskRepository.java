package com.example.asana.repository;

import com.example.asana.model.Task;
import com.example.asana.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
    List<Task> findByAssignedUser_Id(Long userId);
    
    List<Task> findByProject_Id(Long projectId);
    
    List<Task> findByAssignedUser_IdAndStatus(Long userId, TaskStatus status);
    
    List<Task> findByGoalIdAndStatus(Long goalId, TaskStatus status);
    
    List<Task> findByGoalId(Long goalId);
} 