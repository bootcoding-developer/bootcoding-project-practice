package com.bootcoding.user.command.impl;

import com.bootcoding.user.command.Command;
import com.bootcoding.user.command.validator.CommandValidator;
import com.bootcoding.user.model.Result;

public class CreateCommand implements Command, CommandValidator {

    @Override
    public Result execute(String[] attributes) {
        // write logic for create user

        // user input - valid/invalid
        // if input is invalid - stop and throw exception with user friendly message
        // if input is valid - start actual logic - create user
        if(validate(attributes)){
            // start processing
        }
        return null;
    }

    @Override
    public boolean validate(String[] attributes) {
        return false;
    }

}
