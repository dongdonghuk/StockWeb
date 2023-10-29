package com.rich.stockdemo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rich.stockdemo.Model.SignInDTO;
import com.rich.stockdemo.Service.SignInService;

@Controller
public class SignInController {

    @Autowired private SignInService signInService;

    @PostMapping("/")
    public String signIn(@ModelAttribute("signIn") SignInDTO signInDTO, Model model) {
        try {
            int result = signInService.signIn(signInDTO);
            if(result != 0) {
                return "redirect:/";
            }
            model.addAttribute("userId", signInDTO.getUserId());
            return "contentss";
        }
        catch(Exception e){
            e.getMessage();
        }
        return "redirect:/";
    }
}
