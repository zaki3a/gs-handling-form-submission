package com.example.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greetingForm(Model model) {
		model.addAttribute("greeting", new Greeting());
		return "greeting";
	}

	@GetMapping("/hello")
	public String sayHello(Model model){
		//htmlのファイル名をstringで返すとそれが表示される？
		return "hello";
	}

	@PostMapping("/greeting")
	public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
		//model(htmlページ)に渡すオブジェクトとその名前
		model.addAttribute("greetingData", greeting);
		return "result";
	}

}
