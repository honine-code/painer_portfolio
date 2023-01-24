package com.painer.web.controller.email;

import com.painer.web.dto.email.MailDto;
import com.painer.web.service.email.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private final EmailService emailSerice;

    public MainController(EmailService emailSerice) {
        this.emailSerice = emailSerice;
    }

    @GetMapping("/mail/send")
    public String main() {
        return "SendMail.html";
    }

    @PostMapping("/mail/send")
    public String sendMail(MailDto mailDto) {
        emailSerice.sendSimpleMessage(mailDto);
        return "AfterMail.html";
    }
}
