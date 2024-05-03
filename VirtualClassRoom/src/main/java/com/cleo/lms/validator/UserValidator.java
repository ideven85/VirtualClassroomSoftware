package com.cleo.lms.validator;

import com.cleo.lms.users.User;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDecisionVoter;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;

@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {


        User user = (User) object;
        String password = user.getPassword();
        if(!Pattern.matches("[a-zA-Z0-9]+",password)){
            errors.rejectValue("password","Constraints","Password must be alpha numeric");
        }
        if(user.getPassword().length() <6){
            errors.rejectValue("password","Length", "Password must be at least 6 characters");
        }

        if(!user.getPassword().equals(user.getConfirmPassword())){
            errors.rejectValue("confirmPassword","Match", "Passwords must match");

        }

        //confirmPassword



    }
}
