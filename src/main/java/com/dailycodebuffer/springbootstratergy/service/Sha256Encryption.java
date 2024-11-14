package com.dailycodebuffer.springbootstratergy.service;

import org.springframework.stereotype.Service;

@Service
public class Sha256Encryption implements Encryption {

    @Override
    public void encrypt(String message) {
        System.out.println("The message encrypted using sha256 algorithm");
    }

    @Override
    public EncryptionEnum getEncryption() {
        return EncryptionEnum.SHA256;
    }
}
