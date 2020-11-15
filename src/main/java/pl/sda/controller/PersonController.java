package pl.sda.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.dto.PersonDto;
import pl.sda.service.PersonService;

@Controller
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("persons", personService.findAll());
        model.addAttribute("person", PersonDto.builder().build());
        return "index";
    }

    @PostMapping("/add")
    public String addPerson(@ModelAttribute("person") PersonDto person, Model model) {
        personService.add(person);
        model.addAttribute("persons", personService.findAll());
        model.addAttribute("person", PersonDto.builder().build());
        return "index";
    }

}
