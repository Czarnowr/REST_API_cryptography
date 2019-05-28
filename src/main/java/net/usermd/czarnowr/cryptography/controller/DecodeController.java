package net.usermd.czarnowr.cryptography.controller;

import com.google.common.collect.BiMap;
import net.usermd.czarnowr.cryptography.service.DecodeService;
import net.usermd.czarnowr.cryptography.utility.KeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/decode/", produces = "application/json; charset=utf-8")
public class DecodeController {

    @Autowired
    private DecodeService decodeService;

    @PutMapping(path = "/atbash", produces = "application/json; charset=utf-8")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public String decodeUsingAtbash(@RequestBody String messageToDecode) {
        BiMap<Character, Character> atbashKey = KeyGenerator.getSubstitutionKey("zyxwvutsrqponmlkjihgfedcba");

        return decodeService.substituteLetters(messageToDecode, atbashKey);
    }
}
