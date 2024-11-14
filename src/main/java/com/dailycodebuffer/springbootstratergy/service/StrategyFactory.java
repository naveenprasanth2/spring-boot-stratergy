package com.dailycodebuffer.springbootstratergy.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

@Service
public class StrategyFactory {

    Map<EncryptionEnum, Encryption> map;

    @Autowired
    public StrategyFactory(Set<Encryption> encryption) {
        initialize(encryption);
    }

    private void initialize(Set<Encryption> encryption) {
        map = new EnumMap<>(EncryptionEnum.class);
        encryption.forEach(enc -> map.put(enc.getEncryption(), enc));
    }


    public Encryption getEncryption(EncryptionEnum encryptionType) {
        return map.get(encryptionType);
    }
}
