package com.dailycodebuffer.springbootstratergy.service;

public class Sha256Encryption implements Encryption {
    @Override
    public void encrypt(String plainText) {
        System.out.println("The given String " + plainText + " is sha256 encrypted");
    }

    @Override
    public EncryptionType getEncryptionType() {
        return EncryptionType.SHA256;
    }
}