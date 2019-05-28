package net.usermd.czarnowr.cryptography.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/")
public class WebController {

    @GetMapping(path = "api/")
    @ResponseStatus(value = HttpStatus.OK)
    public String getIndexPage() {

        return "index";
    }

    @GetMapping(path = "api")
    @ResponseStatus(value = HttpStatus.OK)
    public String redirectToIndexPage() {

        return "index";
    }
}
