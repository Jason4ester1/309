package com.example.LABS.TestController.mycontroller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{
    @GetMapping("/showflowerList")
    public String sendDataToHtml(Model model) {
        String[] flowers = new String[] { "Rose", "Lily", "Tulip", "Carnation", "Hyacinth" };

        String[] City = new String[] { "nyc", "nj", "dallas", "chicago", "philadelphia" };
        model.addText("flowersVariable");
        model.addText("CityVariable");
        return "viewFlowers";
    }
}