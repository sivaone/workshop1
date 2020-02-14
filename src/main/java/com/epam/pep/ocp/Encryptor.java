package com.epam.pep.ocp;

public class Encryptor {

    public String encrypt(String message, String algorithm) {
        if(algorithm.equals("AES")) {
            return encryptAES(message);
        } else if(algorithm.equals("SHA128")) {
            return encryptSHA128(message);
        } else {
            throw new RuntimeException("Algorithm not found");
        }
    }


    public String encryptAES(String message) {
        // AES Algorithm here
        return message;
    }

    public String encryptSHA128(String message) {
        // SHA128 Algorithm here
        return message;
    }
}
