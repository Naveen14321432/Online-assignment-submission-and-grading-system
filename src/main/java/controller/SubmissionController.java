package controller;

import entity.Submission;
import repository.SubmissionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/submissions")
public class SubmissionController {

    @Autowired
    private SubmissionRepository submissionRepository;

    @PostMapping
    public Submission submitAssignment(@RequestBody Submission submission) {
        return submissionRepository.save(submission);
    }

    @GetMapping
    public List<Submission> getAllSubmissions() {
        return submissionRepository.findAll();
    }
}
