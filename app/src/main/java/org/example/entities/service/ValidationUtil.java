package org.example.entities.service;

import org.example.model.UserInfoDto;

import java.util.regex.Pattern;

public class ValidationUtil
{
    private static final Pattern EMAIN_PATTERN=
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    private static final Pattern PASSWORD_PATTERN=
            Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&#^_\\-])[A-Za-z\\d@$!%*?&#^_\\-]{8,}$");

    public static void validateUser(UserInfoDto userInfoDto){
        //Validate email
        String email= userInfoDto.getEmail();
        String password= userInfoDto.getPassward();
        if(email==null || !EMAIN_PATTERN.matcher(email).matches()){
            throw new IllegalArgumentException("Invalid email address");
        }

        //Validate password

        if(password==null || !PASSWORD_PATTERN.matcher(password).matches()){
            throw new IllegalArgumentException(
                    "Password must contain at least 8 characters, one uppercase letter, " +
                            "one lowercase letter, one digit, and one special character."
            );
        }
    }
}
