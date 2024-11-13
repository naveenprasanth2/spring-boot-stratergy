package com.dailycodebuffer.springbootstratergy.service;

public interface Encryption {
    void encrypt(String plainText);
    EncryptionType getEncryptionType();
}
