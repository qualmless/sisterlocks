package org.launchcode.sisterlocksprofiles;

import org.launchcode.sisterlocksprofiles.data.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private ConsultantRepository consultantRepository;

    @GetMapping
    public String index() {
        return "index";
    }

}


//    @RequestMapping("")
//    public String index(Model model) {
//        model.addAttribute("title", "all consultants");
//        return "index";
//    }