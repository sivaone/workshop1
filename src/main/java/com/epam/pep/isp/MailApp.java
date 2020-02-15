package com.epam.pep.isp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailApp implements Mailer {

    @Override
    public boolean validate(String email) {
        String mailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(mailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    public void send(String msg) {
        // mail send code
    }

    @Override
    public String encode(String message) {
        throw new UnsupportedOperationException();
    }
}
