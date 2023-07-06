package com.example.oracle.repository;

import com.example.oracle.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test, String> {
    List<Test> findAllByNameContaining(String name);
}
