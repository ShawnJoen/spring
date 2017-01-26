package com.demo.sw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.product.ProductVO;

@Controller
public class SimpleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SimpleController.class);
	
	@RequestMapping("/doA")
	public void doA(String msg) {
		logger.info("doA start -------" + msg);
	}
	@RequestMapping("/doC")
	public String doC() {
		return "sampleC";
	}
	@RequestMapping("/doD")
	public String doD(@ModelAttribute("msg") String msg) {
		logger.info("MSG: " + msg);
		return "sampleD";
	}
	@RequestMapping("/doE")
	public String doE(Model model) {
		ProductVO vo = new ProductVO();
		vo.setName("Sample Product");
		vo.setPrice(3000);
		//model.addAttribute("vo", vo);//vo
		model.addAttribute(vo);//productVO
		return "sampleE";
	}
	@RequestMapping("/doF")
	public String doF(RedirectAttributes rab) {
		logger.info("doF start ---------");

		rab.addFlashAttribute("msg","This is the Message!! with redi");
		return "redirect:/doA";
	}
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() {
		ProductVO vo = new ProductVO("샘풀상품", 3000);
		return vo;
	}
}
