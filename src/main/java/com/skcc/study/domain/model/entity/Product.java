package com.skcc.study.domain.model.entity;

import com.skcc.study.domain.model.command.ProductCommand;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

import org.springframework.beans.BeanUtils;

@Data
@Entity
public class Product
{

  @Id
  @GeneratedValue
  private int id;

  @Column
  private String name;
  private int price;
  private int colorId;
  private String contents;

  public Product(ProductCommand productCommand)
  {
    BeanUtils.copyProperties(productCommand, this);
  }

  public Product()
  {
  }
}