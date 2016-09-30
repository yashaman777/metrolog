package com.example.controller;
import com.example.domain.Pribor;
import com.example.repository.PriborRepository;
import com.example.service.PriborService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PriborController {


    private PriborService priborService;

    @Autowired(required = true)
    //@Qualifier(value = "priborService")
    public void setPriborService(PriborService priborService) {
        this.priborService = priborService;
    }

    @RequestMapping(value = "pribors", method = RequestMethod.GET)
    public String listPribors(Model model) {
        model.addAttribute("pribor", new Pribor());
        model.addAttribute("listPribors", this.priborService.listPribors());
        return "pribors";
    }

    @RequestMapping(value = "/pribors/add", method = RequestMethod.POST)
    public String addPribor(@ModelAttribute("pribor") Pribor pribor) {
        if (pribor.getId() == 0) {
            this.priborService.addPribor(pribor);
        } else {
            this.priborService.updatePribor(pribor);
        }
        return "redirect:/pribors";
    }

    @RequestMapping("/remove/{id}")
    public String removePribor(@PathVariable("id") long id) {
        this.priborService.removePribor(id);
        return "redirect:/pribors";
    }

    @RequestMapping("edit/{id}")
    public String editPribor(@PathVariable("id") long id, Model model) {
        model.addAttribute("pribor", this.priborService.getPriborById(id));
        model.addAttribute("listPribors", this.priborService.listPribors());
        return "pribors";
    }

    @RequestMapping("pribordata/{id}")
    public String priborData(@PathVariable("id") long id, Model model){
    model.addAttribute("pribor", this.priborService.getPriborById(id));
        return "pribordata";
}
}

