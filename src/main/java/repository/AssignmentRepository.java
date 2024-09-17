package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Assignment;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
