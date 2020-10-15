package guru.andresquijano.guruspring4chucknorrisjokes.controllers;

import guru.andresquijano.guruspring4chucknorrisjokes.services.JokerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokerService jokerService;

    public JokesController(JokerService jokerService) {
        this.jokerService = jokerService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model){
        String s=jokerService.getJoke();
        model.addAttribute("joke",s);

        return "chucknorris";
    }
}
