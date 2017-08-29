package com.skcc.study.infrastructure.dao;

import com.skcc.study.domain.model.entity.Review;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract interface ReviewDao extends JpaRepository<Review, Integer>
{
  public abstract List<Review> findByProductId(int paramInt);
}