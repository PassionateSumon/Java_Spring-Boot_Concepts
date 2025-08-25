package com.sumon.ChallengeApp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.sumon.ChallengeApp.Challenge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ChallangeAppController {
    List<Challenge> challenges = new ArrayList<>();

    public ChallangeAppController() {
        Challenge c1 = new Challenge(1L, "January", "Learn Java Internals");
        challenges.add(c1);
    }

    @GetMapping("/")
    public String getMethodName() {
        return "Hey there!";
    }

    @PostMapping("/challenges")
    public String createChallenges(@RequestBody Challenge challenge) {
        challenges.add(challenge);
        return "Challenge added successfully...";
    }
    
    

    @GetMapping("/challenges")
    public List<Challenge> getAllChallenges() {
        return challenges;
    }
}
