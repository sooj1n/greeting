package shop.samdul.greeting.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class greetingController {

    @GetMapping("/greeting")
    public String greeting( @RequestParam(
            name="name",
            required = false,
            defaultValue = "HI") String name,
            Model model) {

        model.addAttribute("name", name);

        return "greeting";
    }
}
