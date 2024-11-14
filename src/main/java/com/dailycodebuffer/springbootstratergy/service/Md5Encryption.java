package com.dailycodebuffer.springbootstratergy.service;

import org.springframework.stereotype.Service;

@Service
public class Md5Encryption implements Encryption {
    @Override
    public void encrypt(String message) {
        System.out.println("The message encrypted using md5 algorithm");
    }

    @Override
    public EncryptionEnum getEncryption() {
        return EncryptionEnum.MD5;
    }
}
