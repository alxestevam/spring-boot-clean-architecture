package br.facens.livrosgamificados.livrosgamificados.usecases;


public interface SignUpUserInputBoundary {
    SignUpUserResponseData SignUp(SignUpUserRequestData userRequestData);
}
