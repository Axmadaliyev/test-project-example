package com.example.testproject.controller;

import com.example.testproject.dto.LoginDTO;
import com.example.testproject.entity.Users;
import com.example.testproject.repository.UserRepository;
import com.example.testproject.security.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {


    private final AuthenticationManager authenticationManager;

   private final JwtProvider jwtProvider;

    private final UserRepository userRepository;

    @PostMapping("/login")
    public HttpEntity<?> login(@RequestBody LoginDTO loginDTO){
         Optional<Users> byUsername = userRepository.findByUsername(loginDTO.getUsername());
        Map<Object,Object> map=new HashMap<>();

        if (!byUsername.isPresent()){
            throw new UsernameNotFoundException("Bunday foydalanuvchi mavjud emas");
        }else {

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDTO.getUsername(),loginDTO.getPassword()));

            String s = jwtProvider.generateToken(loginDTO.getUsername());
            map.put("token",s);
            map.put("user",byUsername.get());
            return ResponseEntity.ok(map);
        }

    }


}
