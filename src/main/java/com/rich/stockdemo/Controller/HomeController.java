package com.rich.stockdemo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rich.stockdemo.Model.SignInDTO;

@Controller
public class HomeController {
    @GetMapping(value="/")
    public String home(Model model) {
        model.addAttribute("signIn", new SignInDTO());
        return "signin";
    }

    @GetMapping("/contents")
    public String getContents() {
        return "contents";
    }

    @GetMapping("/contentss")
    public String getContent2() {
        return "contentss";
    }
}
