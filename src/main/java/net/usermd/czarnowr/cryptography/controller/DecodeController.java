package net.usermd.czarnowr.cryptography.controller;

import net.usermd.czarnowr.cryptography.service.DecodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/decode/", produces = "application/json; charset=utf-8")
public class DecodeController {

    @Autowired
    private DecodeService decodeService;


}
