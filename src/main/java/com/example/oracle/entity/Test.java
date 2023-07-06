package com.example.oracle.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "test")
public class Test {
    @Id
    @Column(name = "test_id", nullable = false, length = 50)
    private String testId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;
}
