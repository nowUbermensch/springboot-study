package com.skcc.study.domain.repository;

import com.skcc.study.domain.model.entity.Product;
import com.skcc.study.infrastructure.dao.ProductDao;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository
{
  private static final Logger log = LoggerFactory.getLogger(ProductRepository.class);

  @Autowired
  private ProductDao productDao;

  //물건 불러오기
  public Product getProductById(int id)
    throws IllegalArgumentException
  {
	  //한 놈만 찾아오기
    Product product = (Product)this.productDao.findOne(Integer.valueOf(id));
     //해당하는 물건 없으면 ERR.
    if (product == null) {
      throw new IllegalArgumentException("Product Not Found.");
    }

    return product;
  }

  //물건 추가하기
  public Product addProduct(Product product)
  {
	  //물건받고 물건 저장
    return (Product)this.productDao.save(product);
  }
  
//물건 리스트 뿌리기
  public List<Product> getProductList()
  {
	 //다 가져와서 뿌리기
    List<Product> productList = this.productDao.findAll();
    log.debug("productList ={}", productList);

    return productList;
  }
}