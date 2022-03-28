package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.repository.EmailRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmailController {

    EmailRepository rep = new EmailRepository();


        @GetMapping("/emails")
        public String emails(Model m) {
            String emailToDisplay = rep.fetchSingleMail();
            m.addAttribute("email", emailToDisplay);
            return "emails";
        }

}
