package com.skcc.study.infrastructure.dao;

import com.skcc.study.domain.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


//DAO는 일반적으로 Data Access Objects 라는 의미로 DB 연결을 담당하는 객체
//저는 스프링 데이터 JPA를 사용하기 위해 JpaRepository 상속
public abstract interface ProductDao extends JpaRepository<Product, Integer>
{
}