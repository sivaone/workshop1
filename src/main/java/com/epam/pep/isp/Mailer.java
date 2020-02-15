package com.epam.pep.isp;

public interface Mailer {
    boolean validate(String email);
    String encode(String message);
    void send(String msg);
}
