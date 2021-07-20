package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private List<Car> cars = new ArrayList<>();

    public CarController() {
        cars.add(new Car("1", "1", 2001));
        cars.add(new Car("2", "2", 2002));
        cars.add(new Car("3", "3", 2003));
        cars.add(new Car("4", "4", 2004));
        cars.add(new Car("5", "5", 2005));
    }

    @GetMapping(value = "/car")
    public String printCar(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        System.out.println(count);
        List<Car> messages = new ArrayList<>();
        if (count == null) {
            messages.addAll(cars);
        } else {
            messages.addAll(cars.subList(0, count));
        }
        model.addAttribute("messages", messages);
        return "car";
    }
}
