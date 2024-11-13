package com.dailycodebuffer.springbootstratergy.controller;

import com.dailycodebuffer.springbootstratergy.service.EncryptionType;
import com.dailycodebuffer.springbootstratergy.service.StrategyFactory;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EncryptionController {

    private StrategyFactory strategyFactory;

    @PostMapping
    public ResponseEntity<String> encryption(@RequestBody EncryptionType encryptionType) {
        strategyFactory.getEncryption(encryptionType).encrypt("Summa");
        return ResponseEntity.ok("Encryption Successful");
    }
}
