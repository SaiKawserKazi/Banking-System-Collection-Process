package com.bracit.loancollection.dto;

import com.bracit.loancollection.exception.AbstractException;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class LoanCollectionRequest extends BaseRequest {

    @JsonProperty("OfficeId")
    private Long officeId;

    @JsonProperty("ProjectId")
    private Long projectId;

    @JsonProperty("BusinessDate")
    private Date businessDate;

    @JsonProperty("GroupId")
    private Long groupId;

    @JsonProperty("MemberId")
    private Long memberId;

    @JsonProperty("loanAccountId")
    private Long loanAccountId;

    @JsonProperty("CollectionAmount")
    private Double collectionAmount;

    @JsonProperty("PaymentTypeId")
    private Integer paymentTypeId ;

    @JsonProperty("PaymentSubTypeId")
    private Integer paymentSubTypeId ;

    @JsonProperty("BankAccountId")
    private String bankAccountId ;

    @JsonProperty("ChequeNumber")
    private String chequeNumber ;

    @JsonProperty("ChequeDate")
    private Date chequeDate ;

    @JsonProperty("CreateBy")
    private Long createBy;

    @Override
    public void validate() throws AbstractException {
        if (officeId == null) {
            throw new AbstractException("BEC7001", "BECD7001");
        }
        if(projectId == null){
            throw new AbstractException("BEC7001", "BECD7002");
        }
        if(businessDate == null){
            throw new AbstractException("BEC7001", "BECD7003");
        }
        if(memberId == null){
            throw new AbstractException("BEC7001", "BECD7004");
        }
        if(loanAccountId == null){
            throw new AbstractException("BEC7001", "BECD7006");
        }
        if(collectionAmount == null || collectionAmount <= 0){
            throw new AbstractException("BEC7001", "BECD7005");
        }
        if(paymentTypeId == null){
            throw new AbstractException("BEC7001", "BECD7007");
        }
        if (createBy == null){
            throw new AbstractException("BEC7001", "BECD7008");
        }
    }
}
