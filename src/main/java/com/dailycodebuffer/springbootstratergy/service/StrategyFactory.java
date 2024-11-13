package com.dailycodebuffer.springbootstratergy.service;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@Service
public class StrategyFactory {
    Map<EncryptionType, Encryption> map;

    public StrategyFactory(Set<Encryption> encryption) {
        setEncryption(encryption);
    }

    private void setEncryption(Set<Encryption> encryption) {
        encryption.forEach(encryptionType ->
                map.put(encryptionType.getEncryptionType(), encryptionType));
    }

    public Encryption getEncryption(EncryptionType encryptionType) {
        return map.get(encryptionType);
    }
}
