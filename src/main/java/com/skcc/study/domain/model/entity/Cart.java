package com.skcc.study.domain.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Cart
{

  @Id
  @GeneratedValue
  private int id;

  @Column
  private String status;
  private int quantity;
  private int userId;
  private int productId;
}
