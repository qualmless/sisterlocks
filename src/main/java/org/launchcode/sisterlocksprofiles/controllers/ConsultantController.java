package org.launchcode.sisterlocksprofiles;

import org.launchcode.sisterlocksprofiles.models.Consultant;
import org.launchcode.sisterlocksprofiles.data.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("consultants")
public class ConsultantController {

    @Autowired
    private ConsultantRepository consultantRepository;

    @GetMapping("")
    public String displayLoctitianIndex(Model model) {
        model.addAttribute("title","Consultant Index");
        model.addAttribute("consultants", consultantRepository.findAll());
        return "consultants/index";
    }


    @GetMapping
    public String displayAllConsultants(@RequestParam(required = false) Integer consultantId, Model model) {

//        if (consultantId == null) {
            model.addAttribute("title", "All Consultants");
            model.addAttribute("consultants", consultantRepository.findAll());
//        } else {
//        }
        return "consultants/index";
    }

    @GetMapping("detail")
    public String displayConsultantDetails(@RequestParam Integer consultantId, Model model) {

        Optional<Consultant> result = consultantRepository.findById(consultantId);

//        if (result.isEmpty()) {
//            model.addAttribute("title", "Invalid Consultant ID: " + consultantId);
//        } else {
            Consultant consultant = result.get();
            model.addAttribute("title", consultant.getName() + " Details");
            model.addAttribute("consultant", consultant);
//        }

        return "consultants/detail";
    }


}
