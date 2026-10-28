
package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {

    List<Complaint> complaints = new ArrayList<>();
    int nextId = 1;

    @PostMapping
    public ResponseEntity<?> addComplaint(
            @RequestBody Complaint complaint) {

        if (complaint.getDescription() == null ||
            complaint.getDescription().trim().isEmpty()) {
            return ResponseEntity.badRequest()
                    .body("Complaint description is required");
        }

        if (complaint.getCategory() == null ||
            complaint.getCategory().trim().isEmpty()) {
            return ResponseEntity.badRequest()
                    .body("Complaint category is required");
        }

        Complaint c = new Complaint(
                nextId++,
                complaint.getDescription(),
                complaint.getCategory()
        );

        complaints.add(c);

        return ResponseEntity.status(HttpStatus.CREATED).body(c);
    }

    @GetMapping
    public List<Complaint> getAllComplaints() {
        return complaints;
    }
}
