package controllers;

import models.Consultant;
import models.data.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("consultants")
public class ConsultantController {

    @Autowired
    private ConsultantRepository consultantRepository;

    @GetMapping("add")
    public String displayAddNewLoctitianForm(Model model) {
        model.addAttribute("title","Add Consultant");
        model.addAttribute(new Consultant());
        return "consultants/add";
    }

    @PostMapping("add")
    public String processAddNewLoctitianForm (@ModelAttribute @Valid Consultant newConsultant,
                                              Errors errors,
                                              Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Consultant");
            return "consultants/add";
        }
        consultantRepository.save(newConsultant);
        return "redirect:";
    }

    @GetMapping("")
    public String displayLoctitianIndex(Model model) {
        model.addAttribute("title","Consultant Index");
        model.addAttribute("consultants", consultantRepository.findAll());
        return "consultants/index";
    }

//    @GetMapping("view/{loctitianId}")
//    public String displayView
//


}
