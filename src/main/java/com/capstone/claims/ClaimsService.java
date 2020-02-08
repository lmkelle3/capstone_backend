package com.capstone.claims;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class ClaimsService {

    @Autowired
    private final ClaimsRepository claimsRepository;

    public ClaimsService (ClaimsRepository claimsRepository){
        this.claimsRepository = claimsRepository;
    }

    public List <Claim> getAllClaims(){
        return claimsRepository.findAll();
    }

    public Optional <Claim> getOneContact(int id) {
        return claimsRepository.findById(id);
    }

}
