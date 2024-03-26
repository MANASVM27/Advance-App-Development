package com.boat.boathouse.config;

import static com.boat.boathouse.enumerated.Role.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.boat.boathouse.model.User;
import com.boat.boathouse.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@SuppressWarnings("null")
public class UserCli implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() > 0)
            return;
        var superadmin = User.builder().name("Manas V M").email("manas@gmail.com")
                .password(passwordEncoder.encode("manas@123")).phoneNumber("9078356328").role(SUPERADMIN).active(true)
                .build();
        userRepository.save(superadmin);
    }

}
