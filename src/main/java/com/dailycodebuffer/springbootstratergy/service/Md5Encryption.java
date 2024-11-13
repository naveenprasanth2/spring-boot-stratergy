package com.dailycodebuffer.springbootstratergy.service;

public class Md5Encryption implements Encryption {
    @Override
    public void encrypt(String plainText) {
        System.out.println("The given String " + plainText + " is MD5 encrypted");
    }

    @Override
    public EncryptionType getEncryptionType() {
        return EncryptionType.MD5;
    }
}
