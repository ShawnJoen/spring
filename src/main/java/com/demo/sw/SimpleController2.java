package com.demo.sw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.domain.ProductVO;

@RestController
public class SimpleController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(SimpleController2.class);
	
	@RequestMapping("/doJSON2")
	public ProductVO doJSON2() {
		
		logger.info("doJSON2 start -------");
		
		ProductVO vo = new ProductVO("샘풀상품", 3000);
		return vo;
	}
}
