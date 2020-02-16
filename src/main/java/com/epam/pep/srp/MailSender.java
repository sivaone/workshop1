package com.epam.pep.srp;

import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailSender {

    public void sendMail(String fromEmail, String toEmail, String message, String encodingStyle) {
        if(validate1(fromEmail) && validate2(toEmail) && validate3(message)) {
            String encodedMsg = encodeMessage(message, encodingStyle);
            Transport transport = new Transport(fromEmail, toEmail, encodedMsg);
            transport.send();
        }
    }

    public String encodeMessage(String message, String encodingStyle){
        if(encodingStyle.equals("Base64")) {
            return Base64.getEncoder().encodeToString(message.getBytes());
        } else {
            return message;
        }
    }

    public boolean validate1(String fromEmail) {
        String mailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(mailRegex);
        Matcher matcher = pattern.matcher(fromEmail);
        return matcher.matches();
    }

    public boolean validate2(String toEmail) {
        String mailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(mailRegex);
        Matcher matcher = pattern.matcher(toEmail);
        return matcher.matches();
    }

    public boolean validate3(String message) {
        return message != null && message.length() > 0;
    }
}
