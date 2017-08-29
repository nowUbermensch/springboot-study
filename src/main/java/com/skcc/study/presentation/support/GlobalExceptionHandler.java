package com.skcc.study.presentation.support;

import com.skcc.study.domain.model.exception.IllegalUserException;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler
{
  private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

  @ExceptionHandler({IllegalArgumentException.class})
  void handleIllegalArgumentException(HttpServletResponse response) throws IOException
  {
    log.debug("IllegalArgumentException");

    response.sendError(HttpStatus.BAD_REQUEST.value());
  }
  @ExceptionHandler({IllegalUserException.class})
  void handleIllegalUserException(HttpServletResponse response) throws IOException {
    log.debug("IllegalUserException");
    response.sendError(HttpStatus.FORBIDDEN.value());
  }
}