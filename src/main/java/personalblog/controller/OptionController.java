package personalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.BlogDto;

import blogservice.com.BlogService;

@Controller

public class OptionController {
	
	private BlogService blogservice;

	@RequestMapping(value = "blog", method = RequestMethod.GET)

	public ModelAndView showoption() {
		System.out.println("I am inside the blog API");
		BlogDto b = blogservice.givedemoblog();
		System.out.println(b.toString());

		ModelAndView mv = new ModelAndView("blog");
		mv.addObject("bl", b);
		mv.addObject("username", " *Manoj*");
		return mv;
	}

	public BlogService getBlogservice() {
		return blogservice;
	}

	public void setBlogservice(BlogService blogservice) {
		this.blogservice = blogservice;
	}
	
}
