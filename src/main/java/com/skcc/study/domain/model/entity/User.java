package com.skcc.study.domain.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class User
{

  @Id
  @GeneratedValue
  private int id;

  @Column
  private String userId;
  private String userName;
  private String gender;
}