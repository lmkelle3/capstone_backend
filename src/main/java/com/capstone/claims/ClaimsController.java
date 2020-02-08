package com.capstone.claims;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public Claim getOneClaim(@PathVariable int id) {
        Claim claim = claimsService.getOneClaim(id).orElseThrow(IllegalArgumentException::new);
        return claim;
    }

    @PostMapping
    public Claim addOneClaim(@RequestBody Claim newClaim) {

    }
}
