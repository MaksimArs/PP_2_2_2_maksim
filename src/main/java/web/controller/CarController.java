package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    CarService carService;


    @GetMapping
    public String getCars(@RequestParam(required = false, name = "count") Integer a, Model model) {
        if (a == null) {
            model.addAttribute("something", "Cars");
            model.addAttribute("cars", carService.getAllCars());
        } else {
            model.addAttribute("something", "Cars");
            model.addAttribute("cars", carService.getCars(a));
        }
        return "cars";
    }
}
