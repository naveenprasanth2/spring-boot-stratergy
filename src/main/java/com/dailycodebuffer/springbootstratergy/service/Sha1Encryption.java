package com.dailycodebuffer.springbootstratergy.service;

public class Sha1Encryption implements Encryption{
    @Override
    public void encrypt(String plainText) {
        System.out.println("The given String " + plainText + " is sha1 encrypted");
    }

    @Override
    public EncryptionType getEncryptionType() {
        return EncryptionType.SHA1;
    }
}
