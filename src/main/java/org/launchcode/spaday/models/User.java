package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {
    @NotBlank
    @Size(min = 5, max = 15)
    private String username;

    @Email
    private String email;

    @NotBlank
    @Size(min=6, max=20)
    private String password;

    @NotNull(message="Passwords do not match")
    private String verifyPassword;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    private void checkPassword() {
        if (password != verifyPassword) {
            if (password != null && verifyPassword != null) {
                verifyPassword = null;
            }
        }
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }

    public String getVerifyPassword () {
        return verifyPassword;
    }

    public void setVerifyPassword ( String verifyPassword ) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }

}