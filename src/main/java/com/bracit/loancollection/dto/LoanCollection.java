package com.bracit.loancollection.dto;

import java.util.Date;

public class LoanCollection {
    Date laLastProvisionDate;
    Date laNextCollectionDate;
    Date laDisbursementDate;
    double interestFactor;
    double installmentAmount;
    double laPrincipalOutstanding;
    double laInterestOutstanding;
    double laOutstandingBalance;
    int lcCollectionNo;
    boolean lcIsCollectionDate;
    String lcCollectionRemarks;
    double realizableInterest;
    double interestAmount;
    double realizablePrincipal;
    double totalAmount;
    double laRealizedAmount;
    double realizedInterest;
    double laRealizedPrincipalAmount;
    double laRealizedInterestAmount;

    boolean isTodayHoliday;
    int frequencyId;
    long accountNo;

    int portfolioStatusId;
    long productInfoId;
    int laLoanStatusId;
    double laLateInterestOs;
    double realizedLateInterest;
    int provisionDayCount;

    // Loan Account
    Byte rfRsId;
    String customRule;
    boolean isCollectionNotAllowed;
    int policyGracePeriodInDays;
    double laOverdueAmount;
    double laAdvanceCollectionAmount;
    double laRealizableAmount;
    double laRealizableInterestAmount;
    double laRealizablePrincipalAmount;
    double laInterestProvisionFraction;
    //    double provisionAmount
    double laInterestProvision;
    double principalAmount;
    boolean isCollectionDay;
    double laTargetAmount;
    Date laSettlementDate;
    Long laSettledLoanStatus;
    double laPrincipalProvision;
    double laPrincipalProvisionFraction;
    Date laODCarryingDate;
    int laNoOfOverdueInstalment;
    double laPrincipalOverdueAmount;
    double laOtrPercentage;
    long laVersion;

    // Provision table
    double lpProvisionAmount;
    double lpPrincipalOutstanding;
    double lpInterestOutstanding;
    double lpTargetAmount;
    double lpPrincipalAmount;
    double lpInstallmentAmount;
    int lplatModeOfPaymentId;
    int lplatLoanStatusId;
    int lplatPortfolioStatusId;
    double lplatAccruedInterest;
    double lplatAdvanceCollectionAmount;
    double lplatPrincipalOutstanding;
    double lplatOutstandingBalance;
    //    double lplatRealizableInterest
    double lplatOverdueAmount;
    String lplatParticulars;
    String lpTransactionNo;
    long lpId;
    long lpLatId;

    // Loan Collection

    long lcId;
    double lcRealizableAmount;
    double lcRealizableInterest;
    double lcRealizablePrincipal;
    double lcRealizedAmount;
    double lcRealizedInterestAmount;
    double lcRealizedPrincipalAmount;
    double lcPrincipalOutstanding;
    double lcInterestOutstanding;
    double lcRealizedLateInterest;
    double lcOverdueAmount;
    double lcLastOverdueAmount;
    int lcLoanStatus;
    int lcCurrentLoanStatusId;
    double lcPrincipalOverdueAmount;
    int lcNoOfOverdueInstalment;
    double lcOtrPercentage;
    String lcChequeAccountNumber;
    String lcChequeNumber;
    Date lcChequeDate;
    Long loanProductTypeId;

    // Loan Account Transaction for collection
    int latLoanStatusId;
    double latMemberCommissionAmount;
    double latBracCommissionAmount;
    double latInterestAmount;
    double latInterestOutstanding;
    double latPrincipalAmount;
    double latOverdueAmount;
    double latAccruedInterest;
    double latPrincipalOutstanding;
    double latAdvanceCollectionAmount;
    String latParticulars;
    String latTransactionNo;
    long latId;
    int latTrxType;

    // extra savings collection
    double extraSavingsAmount;
    double savingsBalance;
    double siSavingsInterestBalance;
    Date siCalculatedDate;
    String saAccountNo;
    long saVersion;
    double saId;
    long saSavingsProductId;
    double satInstallmentAmount;
    String satParticulars;
    String satTransactionNo;
    double satSavingsStatusId;
    double satPortfolioStatusId;
    double satDepositAmount;
    double satSavingsBalance;
    double satTrxType;
    String satChequeAccountNumber;
    String satChequeNumber;
    Date satChequeDate;
    double saCalculatedInterestAmount;
    long satId;
    long satInterestId;

    double getLatOutstandingBalance(){
        return latAccruedInterest + latPrincipalOutstanding;
    }


}
