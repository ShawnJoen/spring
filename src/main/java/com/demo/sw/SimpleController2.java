package com.demo.sw;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.product.ProductVO;

@RestController
public class SimpleController2 {
	@RequestMapping("/doJSON2")
	public ProductVO doJSON2() {
		ProductVO vo = new ProductVO("샘풀상품", 3000);
		return vo;
	}
}
