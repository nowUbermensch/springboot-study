package com.skcc.study.infrastructure.dao;

import com.skcc.study.domain.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract interface UserDao extends JpaRepository<User, Integer>
{
}