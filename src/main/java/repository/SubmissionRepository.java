package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Submission;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {
}