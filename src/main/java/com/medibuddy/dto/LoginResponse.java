package com.medibuddy.dto;

import com.medibuddy.utils.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class LoginResponse extends ApiResponse {

    private String email;
    private String firstName;
    private UserType userType;
    private boolean isAuthenticated;
    private String message;

    private LoginResponse(String message) {
        this.message = message;
    }

    public static LoginResponse failedLoginResponseWithMessage(String message) {
        return new LoginResponse(message);
    }
}
