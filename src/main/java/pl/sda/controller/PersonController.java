package pl.sda.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.dto.PersonDto;
import pl.sda.service.PersonService;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping({"/", "/persons"})
    public String mainPage(Model model) {
        model.addAttribute("persons", personService.findAll());
        model.addAttribute("person", PersonDto.builder().build());
        return "index";
    }

    @PostMapping("persons/add")
    public String addPerson(Model model, @ModelAttribute("person") @Valid PersonDto person, BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            personService.add(person);
        }

        model.addAttribute("persons", personService.findAll());
        model.addAttribute("person", PersonDto.builder().build());
        return "index";
    }

}
