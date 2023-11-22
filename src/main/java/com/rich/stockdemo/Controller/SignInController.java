package com.rich.stockdemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rich.stockdemo.Model.UsersDTO;
import com.rich.stockdemo.Service.SignInService;

import io.netty.util.internal.StringUtil;

@Controller
public class SignInController {

    @Autowired private SignInService signInService;

    @PostMapping("/")
    public String signIn(@ModelAttribute("signIn") UsersDTO signInDTO, Model model) {
        try {
            UsersDTO user = signInService.getUserInfo(signInDTO);
            // int result = signInService.signIn(signInDTO);
            if(StringUtil.isNullOrEmpty(user.getUserKey())) {
                return "redirect:/";
            }
            model.addAttribute("userKey", user.getUserKey());
            model.addAttribute("userName", user.getUserName());
            model.addAttribute("userId", user.getUserName());
            return "contentss";
        }
        catch(Exception e){
            System.err.println(e);
            e.getMessage();
        }
        return "redirect:/";
    }
}
