package y.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
 @GetMapping("/")
 public String home() {
	 return "home";
 }
 @GetMapping("/add")
 public String create() {
	 return "add";
 }
 
}
