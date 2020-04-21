package controllers;

import models.data.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @Autowired
    private ConsultantRepository consultantRepository;

//    @RequestMapping("")
//    public String index(Model model) {
//        model.addAttribute("title", "all consultants");
//        return "index";
//    }


}
