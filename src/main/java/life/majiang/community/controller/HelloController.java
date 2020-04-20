package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(@RequestParam(name="name") String name, Model model) {   //接收一個參數，@RequestParam "請求的參數"
		model.addAttribute("name",name);		
		return "hello";  //這個時候，它就會自動去找hello.html這個模板 (src\man\resources\templates)
	}

}
