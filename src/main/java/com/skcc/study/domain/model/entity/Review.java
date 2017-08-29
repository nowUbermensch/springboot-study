package com.skcc.study.domain.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Review
{

  @Id
  @GeneratedValue
  int id;
  int productId;
  String title;
  String content;
}
