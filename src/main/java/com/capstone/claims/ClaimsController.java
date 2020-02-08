package com.capstone.claims;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/claims")

public class ClaimsController {

    @Autowired
    private final ClaimsService claimsService;

    public ClaimsController (ClaimsService claimsService) {
        this.claimsService = claimsService;
    }

    @GetMapping
    public List<Claim> getAllClaims() {
        return this.claimsService.getAllClaims();
    }
}
