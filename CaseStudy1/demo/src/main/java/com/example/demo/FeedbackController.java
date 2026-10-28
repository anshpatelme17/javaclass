package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackController {

    private final List<Feedback> feedbackList =
            new ArrayList<>();

    @PostMapping("/feedback")
    public String submitFeedback(
            @RequestBody Feedback feedback) {
        feedbackList.add(feedback);
        return "Feedback submitted successfully!";
    }

    @GetMapping("/feedback")
    public List<Feedback> getAllFeedback() {
        return feedbackList;
    }
}
