package com.bracit.loancollection.dto;

import com.bracit.loancollection.exception.AbstractException;

public abstract class BaseRequest {
    private String requestId;

    abstract public void validate() throws AbstractException;
}
