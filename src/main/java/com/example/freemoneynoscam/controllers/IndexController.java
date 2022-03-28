package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.services.ValidateEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/test")
    public String test(WebRequest dataFromForm) {
        ValidateEmailService o = new ValidateEmailService();

        if (o.isEmailValid(dataFromForm.getParameter("email"))) {

            return "redirect:/create-product-success";
        } else return "redirect:/";
    }

    @GetMapping("/create-product-success")
    public String createProductPageSuccess() {
        return "create-product-success";
    }
}





