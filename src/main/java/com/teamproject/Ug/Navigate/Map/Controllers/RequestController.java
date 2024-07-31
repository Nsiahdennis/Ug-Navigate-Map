package com.teamproject.Ug.Navigate.Map.Controllers;
import com.teamproject.Ug.Navigate.Map.Entities.Route;
import com.teamproject.Ug.Navigate.Map.NavigationAlgorithm.AStar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@Controller
public class RequestController {

        @GetMapping("/index")
        public String findroute(Model model){
                Route route = new Route();
                model.addAttribute("route", route);

                System.out.println("route...");
                return "result";
        };


        @RequestMapping(value = "/findroute", method = {RequestMethod.GET, RequestMethod.POST})
        public String submitForm(@ModelAttribute("route") Route user, Model model) {
                model.addAttribute("route", user);
                System.out.println("Submitted...");
                System.out.println(user.getDestination());
                System.out.println("Calculation...");

                System.out.println(user.getSource());

                AStar astar = new AStar(user.getSource(), user.getDestination());
                astar.Astar();

                return "index";
        }


}
