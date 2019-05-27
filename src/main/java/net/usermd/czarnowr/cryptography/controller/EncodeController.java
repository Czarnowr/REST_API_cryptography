package net.usermd.czarnowr.cryptography.controller;

import net.usermd.czarnowr.cryptography.service.EncodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/encode/", produces = "application/json; charset=utf-8")
public class EncodeController {

    @Autowired
    private EncodeService encodeService;


}
