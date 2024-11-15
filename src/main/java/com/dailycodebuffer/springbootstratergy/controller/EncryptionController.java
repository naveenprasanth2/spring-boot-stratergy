package com.dailycodebuffer.springbootstratergy.controller;

import com.dailycodebuffer.springbootstratergy.service.EncryptionEnum;
import com.dailycodebuffer.springbootstratergy.service.StrategyFactory;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EncryptionController {

    private StrategyFactory strategyFactory;

    @PostMapping("/encrypt")
    public ResponseEntity<String> encryption(@RequestHeader("Strategy") EncryptionEnum encryptionType) {
        strategyFactory.getEncryption(encryptionType).encrypt("Summa");
        return ResponseEntity.ok("Encryption Successful");
    }
}
