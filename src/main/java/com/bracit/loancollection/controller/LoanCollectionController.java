package com.bracit.loancollection.controller;

import com.bracit.loancollection.dto.LoanCollectionRequest;
import com.bracit.loancollection.dto.LoanCollectionResponse;
import com.bracit.loancollection.exception.AbstractException;
import com.bracit.loancollection.service.LoanCollectionValidationService;
import com.bracit.loancollection.service.LoanCollectionValidationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoanCollectionController {

    private final LoanCollectionValidationService loanCollectionValidationService;

    @Autowired
    public LoanCollectionController(LoanCollectionValidationServiceImpl loanCollectionValidationService) {
        this.loanCollectionValidationService = loanCollectionValidationService;
    }

    @PostMapping("/loan-collection")
    public LoanCollectionResponse LoanCollectionValidation(@RequestBody LoanCollectionRequest loanCollectionRequest) throws AbstractException {
        loanCollectionRequest.validate();
        return loanCollectionValidationService.loanCollectionvalidation(loanCollectionRequest);
    }
}
