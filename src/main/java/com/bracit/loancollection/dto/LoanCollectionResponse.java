package com.bracit.loancollection.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LoanCollectionResponse {
    @JsonProperty("ResponseCode")
    private String ResponseCode;

    @JsonProperty("ResponseDesc")
    private String ResponseDesc;
}
