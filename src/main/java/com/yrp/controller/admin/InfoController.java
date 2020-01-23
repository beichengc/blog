package com.yrp.controller.admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class InfoController {

    @GetMapping("/info")
    public String info(){

        return "admin/about";
    }
}
