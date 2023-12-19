package com.bootcoding.user.command;

import com.bootcoding.user.model.Result;

public class UpdateCommand implements Command, CommandValidator{
    @Override
    public Result execute(String[] attributes) {
        // write logic for update user
        return null;
    }

    @Override
    public boolean validate(String[] attributes) {
        return false;
    }
}
