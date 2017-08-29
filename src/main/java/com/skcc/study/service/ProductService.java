package com.skcc.study.service;

import java.util.List;

import com.skcc.study.domain.model.command.ProductCommand;
import com.skcc.study.domain.model.entity.Product;
import com.skcc.study.domain.repository.ProductRepository;
import com.skcc.study.presentation.controller.web.post.ProductViewController;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService
{
	private static final Logger log = LoggerFactory.getLogger(ProductViewController.class);
  @Autowired
  private ProductRepository productRepository;

  //제품을 추가하는 기능 --> 아직 필요한 기능은 아니지만 생성용으로 구현.
  @Transactional
  public Product addProduct(ProductCommand productCommand)
  {
    Product product = this.productRepository.addProduct(new Product(productCommand));
    product.setId(product.getId());
    return product;
  }
  
//전체 제품 리스트를 조회해오는 기능 
  public List<Product> getProductList()
  {
	 //다 가져와서 뿌리기
    List<Product> productList = this.productRepository.getProductList();
    log.debug("productList ={}", productList);

    return productList;
  } 

  
  //제품 id 를 통해서 제품 정보를 불러오는 기능
  public Product findProductById(int id)
  {
	  	Product product = this.productRepository.getProductById(id);  	
	  	log.debug("product= {}", this.productRepository.getProductById(id));
	  	return product;
  }
  
  
}

