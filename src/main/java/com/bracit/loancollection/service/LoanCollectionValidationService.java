package com.bracit.loancollection.service;

import com.bracit.loancollection.dto.LoanCollectionRequest;
import com.bracit.loancollection.dto.LoanCollectionResponse;
import com.bracit.loancollection.exception.AbstractException;

public interface LoanCollectionValidationService {
    LoanCollectionResponse loanCollectionvalidation(LoanCollectionRequest loanCollectionRequest) throws AbstractException;
}
