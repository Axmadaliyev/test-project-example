package com.example.testproject.repository;

import com.example.testproject.entity.DetailDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface DetailDescriptionRepository extends JpaRepository<DetailDescription,Long> {
    List<Optional<DetailDescription>> findAllByActiveTrue();
}
