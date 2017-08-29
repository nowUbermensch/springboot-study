package com.skcc.study.presentation.controller.web.post;


import com.skcc.study.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductViewController
{
  
  @Autowired
  ProductService productService;

  
  //상품 상세보기 페이지 --> 필요기능  : 상품 정보 조회 / 해당 상품에 대한 리뷰 / 장바구니 담기 / SNS공유 /별점 조회기능
  @RequestMapping({"/product/{id}"})
  public String list(Model model, @PathVariable int id) 
  { 
	  
	  //모든 처리는 Service에서 처리하고, View 단에서는 값 만 던져와서 처리합니다. 
	  //REST API를 만들 실력은 아니라...MSA 흉내내기 ^^;
	  model.addAttribute("product", this.productService.findProductById(id));
	  
	  
	  //=============================================================================================
	  //★본인의 기능을 구현해 아래에 Service를 불러와서 담아주세요.
	  //제가 임의로 몇가지 기능 구현해야될 것 넣어 본 것이고 얼마든지 변경하셔서 기능 구현해주셔도 됩니다 :D
	  //=============================================================================================
	  //해당 제품에 대한 리뷰 리스트 조회 기능
      //리뷰 클릭시 리뷰 내용 조회 기능
      //해당 제품에 대한 별점 조회 기능
      //해당 제품 SNS 공유 기능
     
     
	  return "product/product"; 
  }

}