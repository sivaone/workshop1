package com.epam.pep.srp;

public class Transport {
    private String from;
    private String to;
    private String message;

    public Transport(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    public void send() {
        System.out.println("Mail sent.");
    }
}
