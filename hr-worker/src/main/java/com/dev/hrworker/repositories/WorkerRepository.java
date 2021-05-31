package com.dev.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
