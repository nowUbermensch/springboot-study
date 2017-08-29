package com.skcc.study.domain.repository;

import com.skcc.study.domain.model.entity.User;
import com.skcc.study.infrastructure.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository
{
  private static final Logger log = LoggerFactory.getLogger(UserRepository.class);

  @Autowired
  private UserDao userDao;

  public User getUserById(int id)
    throws IllegalArgumentException
  {
    User user = (User)this.userDao.findOne(Integer.valueOf(id));
    if (user == null) {
      throw new IllegalArgumentException("User Not Found.");
    }

    return user;
  }
}