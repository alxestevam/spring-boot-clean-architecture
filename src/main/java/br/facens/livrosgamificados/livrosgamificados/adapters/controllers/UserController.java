package br.facens.livrosgamificados.livrosgamificados.adapters.controllers;

import br.facens.livrosgamificados.livrosgamificados.usecases.SignUpUserRequestData;
import br.facens.livrosgamificados.livrosgamificados.usecases.SignUpUserInputBoundary;
import br.facens.livrosgamificados.livrosgamificados.usecases.SignUpUserResponseData;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("users")
public class UserController {
    private final SignUpUserInputBoundary signUpUserInputBoundary;

    public UserController(SignUpUserInputBoundary signUpUserInputBoundary) {
        this.signUpUserInputBoundary = signUpUserInputBoundary;
    }

    @PostMapping()
    SignUpUserResponseData insert(@RequestBody SignUpUserRequestData dto) {
        return this.signUpUserInputBoundary.SignUp(dto);
    }
}
