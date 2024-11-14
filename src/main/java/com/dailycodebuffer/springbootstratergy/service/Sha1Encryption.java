package com.dailycodebuffer.springbootstratergy.service;

import org.springframework.stereotype.Service;

@Service
public class Sha1Encryption implements Encryption{
    @Override
    public void encrypt(String message) {
        System.out.println("The message encrypted using sha1 algorithm");
    }

    @Override
    public EncryptionEnum getEncryption() {
        return EncryptionEnum.SHA1;
    }
}
