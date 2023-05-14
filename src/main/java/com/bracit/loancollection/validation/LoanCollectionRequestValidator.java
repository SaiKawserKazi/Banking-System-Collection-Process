package com.bracit.loancollection.validation;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LoanCollectionRequestValidator implements LoanValidationForCollection {


    @Override
    public boolean isLienLoan(Long memberId) {
        return false;
    }
}
