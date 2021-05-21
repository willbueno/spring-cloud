package com.dev.worker.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.worker.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
