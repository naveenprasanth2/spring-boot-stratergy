package com.dailycodebuffer.springbootstratergy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

@Service
public class StrategyFactory {
    Map<EncryptionType, Encryption> map;

    @Autowired
    public StrategyFactory(Set<Encryption> encryption) {
        map = new EnumMap<>(EncryptionType.class);
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
