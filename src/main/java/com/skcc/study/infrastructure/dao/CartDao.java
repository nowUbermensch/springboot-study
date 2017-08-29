package com.skcc.study.infrastructure.dao;

import com.skcc.study.domain.model.entity.Cart;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract interface CartDao extends JpaRepository<Cart, Integer>
{
  public abstract List<Cart> findByUserId(int paramInt);
}