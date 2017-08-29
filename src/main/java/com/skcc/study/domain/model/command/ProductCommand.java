package com.skcc.study.domain.model.command;


import com.skcc.study.domain.model.entity.Product;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;


@Data
@NoArgsConstructor
public class ProductCommand
{
  private static final Logger log = LoggerFactory.getLogger(ProductCommand.class);
  int id;

  @NotNull
  @Size(min=1, max=255)
  String name;
  String contents;

  @NotNull
  int price;
  int colorID;

  public ProductCommand(Product product)
  {
    BeanUtils.copyProperties(product, this);
  }
}
