package controllers;

import models.Loctitian;
import models.data.LoctitianRepository;
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
@RequestMapping("loctitians")
public class LoctitianController {

    @Autowired
    private LoctitianRepository loctitianRepository;

    @GetMapping("add")
    public String displayAddNewLoctitianForm(Model model) {
        model.addAttribute("title","Add Loctitian");
        model.addAttribute(new Loctitian());
        return "loctitians/add";
    }

    @PostMapping("add")
    public String processAddNewLoctitianForm (@ModelAttribute @Valid Loctitian newLoctitian,
                                              Errors errors,
                                              Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Loctitian");
            return "loctitians/add";
        }
        loctitianRepository.save(newLoctitian);
        return "redirect:";
    }

    @GetMapping("")
    public String displayLoctitianIndex(Model model) {
        model.addAttribute("title","Loctitian Index");
        model.addAttribute("loctitians", loctitianRepository.findAll());
        return "loctitians/index";
    }

//    @GetMapping("view/{loctitianId}")
//    public String displayView
//


}
