package com.example.testproject.repository;

import com.example.testproject.entity.WorkerHomework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WorkerHomeworkRepository extends JpaRepository<WorkerHomework,Long> {

    List<Optional<WorkerHomework>> findAllByActiveTrue();
}
