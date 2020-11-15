package pl.sda.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.service.PersonService;

@Controller
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/")
    public String mainPage(Model model) {

        model.addAttribute("persons", personService.findAll());
        return "index";
    }
}
