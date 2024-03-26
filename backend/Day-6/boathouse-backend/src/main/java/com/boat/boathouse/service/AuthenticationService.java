package com.boat.boathouse.service;

import com.boat.boathouse.dto.request.LoginRequest;
import com.boat.boathouse.dto.request.RegisterRequest;
import com.boat.boathouse.dto.response.LoginResponse;

public interface AuthenticationService {

    String register(RegisterRequest registerRequest);

    LoginResponse login(LoginRequest loginRequest);

}
