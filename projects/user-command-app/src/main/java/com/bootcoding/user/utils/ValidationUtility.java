package com.bootcoding.user.utils;

import java.util.regex.Pattern;

public class ValidationUtility {

    public static boolean validateEmail(String emailId){
        // check @ exists in given string

        if(!emailId.contains("@")){
            return false;
        }
        if(!emailId.contains(".com")){
            return false;
        }

        return true;
    }

    public static boolean validateAttributes(String attrName) {
        switch (attrName){
            case "-n":
                return true;
            case "-p":
                return true;
            case "-a":
                return true;
            case "-e":
                return true;
            default:
                return false;

        }
    }
}
