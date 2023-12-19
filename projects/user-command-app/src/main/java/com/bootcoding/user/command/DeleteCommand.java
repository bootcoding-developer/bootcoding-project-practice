package com.bootcoding.user.command;

import com.bootcoding.user.model.Result;

public class DeleteCommand implements Command, CommandValidator{
    @Override
    public Result execute(String[] attributes) {
        // write logic for delete user
        return null;
    }

    @Override
    public boolean validate(String[] attributes) {
        return false;
    }
}
