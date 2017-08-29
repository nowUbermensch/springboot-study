package com.skcc.study.application.configuration;

import com.skcc.study.Booter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
//SpringBootServletInitializer 를 상속받은 class
//외부 톰켓에 돌리기 위해서 하는 추가적인 작업
public class ServletInitializer extends SpringBootServletInitializer
{
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
  {
    return application.sources(new Class[] { Booter.class });
  }
}