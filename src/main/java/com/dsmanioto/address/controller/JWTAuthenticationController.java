package com.dsmanioto.address.controller;

import com.dsmanioto.address.authentication.jwt.JwtTokenUtil;
import com.dsmanioto.address.exception.JWTAuthenticaationExeception;
import com.dsmanioto.address.service.UserAutenticationService;
import com.dsmanioto.address.controller.dto.request.JWTUserRequestDTO;
import com.dsmanioto.address.controller.dto.response.JWTUserResponseDTO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@CrossOrigin
@Api(tags = "Authentication")
@RestController
@RequestMapping("/authentication/public")
public class JWTAuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserAutenticationService userAutentication;

    @PostMapping
    public ResponseEntity<JWTUserResponseDTO> createAuthenticationToken(@RequestBody JWTUserRequestDTO jwtUserDTO) {
        authenticate(jwtUserDTO.getUsername(), jwtUserDTO.getPassword());

        final UserDetails userDetails = userAutentication.loadUserByUsername(jwtUserDTO.getUsername());

        final String token = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new JWTUserResponseDTO(token));
    }

    private void authenticate(String username, String password) {
        Objects.requireNonNull(username);
        Objects.requireNonNull(password);

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new JWTAuthenticaationExeception("USER_DISABLED", e.getMessage());
        } catch (BadCredentialsException e) {
            throw new JWTAuthenticaationExeception("INVALID_CREDENTIALS", e.getMessage());
        }
    }

}
