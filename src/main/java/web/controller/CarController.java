package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        CarService service = new CarServiceImpl();
        List <Car> cars = service.getCars(Car.getCars(), count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
