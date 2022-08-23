package com.rsp.rock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rsp.rock.service.Servicerps;

@RestController
public class Controller {

    @Autowired
    private Servicerps svc;

    @GetMapping("/home")
    public String home() {
        return "Working";
    }

    @GetMapping("/home/{input}")
    public String gen(@PathVariable String input) {
        return svc.gen(input);
    }

}
