package controllers;

import models.Consultant;
import models.data.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

//    @GetMapping("view/{loctitianId}")
//    public String displayView


    @GetMapping
    public String displayAllConsultants(@RequestParam(required = false) Integer consultantId, Model model) {

        if (consultantId == null) {
            model.addAttribute("title", "All Consultants");
            model.addAttribute("consultants", consultantRepository.findAll());
        } else {
//            Optional<EventCategory> result = eventCategoryRepository.findById(consultantId);
//            if (result.isEmpty()) {
//                model.addAttribute("title", "Invalid Category ID: " + consultantId);
//            } else {
//                EventCategory category = result.get();
//                model.addAttribute("title", "Events in category: " + category.getName());
//                model.addAttribute("events", category.getConsultants());
//            }
        }
        return "consultants/index";
    }

    @GetMapping("detail")
    public String displayConsultantDetails(@RequestParam Integer consultantId, Model model) {

        Optional<Consultant> result = consultantRepository.findById(consultantId);

        if (result.isEmpty()) {
            model.addAttribute("title", "Invalid Consultant ID: " + consultantId);
        } else {
            Consultant consultant = result.get();
            model.addAttribute("title", consultant.getName() + " Details");
            model.addAttribute("consultant", consultant);
        }

        return "consultants/detail";
    }


}
