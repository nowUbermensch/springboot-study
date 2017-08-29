package com.skcc.study.domain.repository;

import com.skcc.study.domain.model.entity.Review;
import com.skcc.study.infrastructure.dao.ReviewDao;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class ReviewRepository
{

  @Autowired
  ReviewDao reviewDao;

  public void insertProductReview(Review review)
  {
  }

  public List<Review> findByProductId(int productId)
    throws IllegalArgumentException
  {
    List<Review> reviewList = this.reviewDao.findByProductId(productId);
    if (reviewList == null) {
      throw new IllegalArgumentException("Review Not Found.");
    }
    return reviewList;
  }

  public void deletePostTag(Review review) {
    this.reviewDao.delete(Integer.valueOf(review.getId()));
  }
}