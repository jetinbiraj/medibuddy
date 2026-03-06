package com.medibuddy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorResponse extends ApiResponse {
    private int statusCode;
    private String errorMessage;
}
