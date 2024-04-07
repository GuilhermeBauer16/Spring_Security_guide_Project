package com.eazybytes.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {
    @GetMapping("/contact")
    public String saveContractInquiryDetails(){
        return "Inquiry details are saved to the DB";
    }
}



