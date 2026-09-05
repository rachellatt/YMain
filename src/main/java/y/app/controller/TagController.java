package y.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TagController {
 @GetMapping("/")
 public String tag() {
	 return "tag";
 }
}
