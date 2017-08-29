package com.skcc.study.service;



import com.skcc.study.domain.model.command.ProductCommand;
import com.skcc.study.domain.model.entity.Cart;
import com.skcc.study.domain.model.entity.Product;
import com.skcc.study.domain.model.entity.User;
import com.skcc.study.domain.repository.CartRepository;
import com.skcc.study.domain.repository.ProductRepository;
import com.skcc.study.presentation.controller.web.post.ProductViewController;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService
{
	private static final Logger log = LoggerFactory.getLogger(ProductViewController.class);
  
	
@Autowired
  private ProductRepository productRepository;

@Autowired
  private CartRepository cartRepository;
/*
  //제품을 추가하는 기능 --> 아직 필요한 기능은 아니지만 생성용으로 구현.
  @Transactional
  public Cart addCart(Product product,User user,)
  {
	  Cart cart = this.cartRepository.addCart(product, user);
	  
	  cart.setStatus(0); //미결제
	  cart.setProductId(product.getId());
	  cart.setQuantity(quantity);
	  cart.set
	  
	  
	  return 
  }
  
  
  
  
}




//장바구니에 물건 담는 기능
public Cart addCart(Product product, User user)
{
  Cart cart = new Cart();
	    if (user == null) {
	      int i = 1; //테스트용 아이디 
	    }
	    else if (user != null)
	    {
	      cart.setProductId(product.getId());  //카트에다가 물건 넣어주기 
	      cart.setQuantity(1); //수량 넣어주기 테스트용으로 그냥 1 하드코딩 
	      cart.setStatus("장바구니"); //이거도 그냥 테스트테스트
	      cart.setUserId(user.getId()); //유저아이디 강제로 넣기 
	    }

  return (Cart)this.cartDao.save(cart); //카트 저장
}




  @Id
  @GeneratedValue
  private int id;

  @Column
  private String status;
  private int quantity;
  private int userId;
  private int productId;


*/

}