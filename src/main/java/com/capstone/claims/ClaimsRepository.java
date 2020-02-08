package com.capstone.claims;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimsRepository extends JpaRepository<Claim, Integer> {
}
