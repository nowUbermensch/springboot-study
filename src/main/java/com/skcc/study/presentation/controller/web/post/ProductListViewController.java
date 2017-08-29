package com.skcc.study.presentation.controller.web.post;



import com.skcc.study.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductListViewController
{
  
  @Autowired
  ProductService productService;

  
  //웹 처음 페이지 : 기본 구성
  @RequestMapping("/product/list")
  public String productList(Model model) {	  
	 
	  model.addAttribute("productList",this.productService.getProductList());
	
	  return "product/list"; 
  }

}