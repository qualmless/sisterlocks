package controllers;

import models.data.LoctitianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private LoctitianRepository loctitianRepository;

//    @RequestMapping("")
//    public String index(Model model) {
//        model.addAttribute("title", "all loctitians");
//        return "index";
//    }


}
