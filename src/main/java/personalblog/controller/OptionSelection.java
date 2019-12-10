package personalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OptionSelection {
	@RequestMapping(value = "select", method = RequestMethod.GET)

	public String displayoption() {

		System.out.println("Hi, select your options !!");

		return "select";

	}
}
