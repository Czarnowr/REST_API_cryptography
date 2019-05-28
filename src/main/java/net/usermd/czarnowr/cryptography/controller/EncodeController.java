package net.usermd.czarnowr.cryptography.controller;

import com.google.common.collect.BiMap;
import net.usermd.czarnowr.cryptography.service.EncodeService;
import net.usermd.czarnowr.cryptography.utility.KeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/encode/", produces = "application/json; charset=utf-8")
public class EncodeController {

    @Autowired
    private EncodeService encodeService;

    @PutMapping(path = "/atbash", produces = "application/json; charset=utf-8")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public String encodeUsingAtbash(@RequestBody String messageToEncode) {
        BiMap<Character, Character> atbashKey = KeyGenerator.getSubstitutionKey("zyxwvutsrqponmlkjihgfedcba");

        return encodeService.substituteLetters(messageToEncode, atbashKey);
    }
}
