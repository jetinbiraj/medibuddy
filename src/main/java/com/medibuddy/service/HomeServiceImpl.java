package com.medibuddy.service;

import com.medibuddy.dto.LoginResponse;
import com.medibuddy.entity.Login;
import com.medibuddy.repository.LoginRepository;
import com.medibuddy.utils.UserType;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HomeServiceImpl implements HomeService {

    private final LoginRepository loginRepo;

    public HomeServiceImpl(LoginRepository loginRepo) {
        this.loginRepo = loginRepo;
    }

    @Override
    public LoginResponse authenticateUser(String email, String password) {

        Optional<Login> optional = loginRepo.findByEmail(email);

        if (optional.isEmpty()) {
            return LoginResponse.failedLoginResponseWithMessage("user not found with email: " + email);
        }

        if (!password.equals(optional.get().getPassword())) {
            return LoginResponse.failedLoginResponseWithMessage("invalid password");
        }

        Login login = optional.get();
        return new LoginResponse(email, login.getFirstName(), UserType.valueOf(login.getUserType()), true, "login successful");
    }
}
