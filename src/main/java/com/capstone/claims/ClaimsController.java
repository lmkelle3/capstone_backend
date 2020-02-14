package com.capstone.claims;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
        if(newClaim.getLossCategory() == null) {
            throw new IllegalArgumentException("Please select loss category");
        }
        return claimsService.addOneClaim(newClaim);
    }

    @PatchMapping
    public Claim updateOneClaim(@RequestBody Claim updatedClaim) {
        Claim claim = claimsService.getOneClaim(updatedClaim.getId()).orElseThrow(IllegalArgumentException::new);
        return claimsService.updateOneClaim(updatedClaim);
    }

    @DeleteMapping("/{id}")
    public HashMap removeOneClaim(@PathVariable int id) {
        Claim claim = claimsService.getOneClaim(id).orElseThrow(IllegalArgumentException::new);
        return claimsService.removeOneClaim(id);
    }
}
