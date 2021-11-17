package com.bridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestEmailIds {
	public String regex;


    public boolean testForValidEmails(String validEmails) {
        regex = "^[a-zA-Z0-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(validEmails);
        return matcher.matches();
    }
    public boolean testForNonValidEmails(String nonValidEmails) {
        regex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nonValidEmails);
        return matcher.matches();
    }
}
