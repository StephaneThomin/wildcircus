package com.wcs.wildcircus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PriceController {
  
  @GetMapping("/price")
  public String Price() {
    return "price";
  }
}