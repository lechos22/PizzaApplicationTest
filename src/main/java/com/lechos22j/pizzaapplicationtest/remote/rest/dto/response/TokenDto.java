package com.lechos22j.pizzaapplicationtest.remote.rest.dto.response;

public class TokenDto {
    // fields: String token
    private String token;
    // constructors: TokenDto(), TokenDto(String token)
    public TokenDto() {
    }
    public TokenDto(String token) {
        this.token = token;
    }
    // getters and setters: getToken(), setToken()
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
}
