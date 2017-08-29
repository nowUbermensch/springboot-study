package com.skcc.study.presentation.controller.web.post;


import com.skcc.study.domain.model.command.ProductCommand;
import com.skcc.study.domain.model.entity.Product;
import com.skcc.study.service.ProductService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/cart/add"})
public class CartAddController
{

  @Autowired
  ProductService productService;


  @RequestMapping(method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public String add(@Valid ProductCommand product, BindingResult bindingResult, Model model)
  {
    
    if (bindingResult.hasErrors()) {
      return "product/form";
    }

    return "redirect:/product/" + this.productService.addProduct(product).getId();
  }
}