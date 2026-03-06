package com.medibuddy.service;

import com.medibuddy.dto.LoginResponse;

public interface HomeService {

    LoginResponse authenticateUser(String email, String password);

}
