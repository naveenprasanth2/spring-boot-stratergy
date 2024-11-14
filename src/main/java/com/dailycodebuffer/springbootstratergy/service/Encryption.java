package com.dailycodebuffer.springbootstratergy.service;

public interface Encryption {
    void encrypt(String message);
    EncryptionEnum getEncryption();
}
