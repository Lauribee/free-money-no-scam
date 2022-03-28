package com.example.freemoneynoscam.services;

public class ValidateEmailService {
    public boolean isEmailValid(String email){
        if (email.contains(".") && email.contains("@")) {
            return true;
        } else return false;
    }
}
