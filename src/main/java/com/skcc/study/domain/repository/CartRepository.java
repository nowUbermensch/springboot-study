package com.skcc.study.domain.repository;

import com.skcc.study.domain.model.entity.Cart;
import com.skcc.study.domain.model.entity.Product;
import com.skcc.study.domain.model.entity.User;
import com.skcc.study.infrastructure.dao.CartDao;
import com.skcc.study.infrastructure.dao.ProductDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Repository
public class CartRepository
{
  private static final Logger log = LoggerFactory.getLogger(CartRepository.class);

  @Autowired
  private ProductDao productDao;

  @Autowired
  private CartDao cartDao;

  //UserID 별로 장바구니 가져오는 서비스 구현 
  public Cart getCartByUserId(User user) {
    Cart cart = null;
    		//User가 없는 경우 (로그인 하지 않은 경우)
		    if (user == null) {
		      int sessionId = 1;  //테스트용으로 하드코딩
		      cart = (Cart)this.cartDao.findOne(Integer.valueOf(sessionId)); //SessiondID 1인 카트 반환
		    }
		    //User가 있는 경우 (로그인 한 경우)
		    else if (user != null)
		    {
		      cart = (Cart)this.cartDao.findOne(Integer.valueOf(user.getId()));
		      //UserID에 해당하는 Cart 반환
		    }

    return cart;
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
}