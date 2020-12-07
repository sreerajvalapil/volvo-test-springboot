package com.example.testspringboot.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BankController {

  @RequestMapping("/branch")
  public String getMainBranchName() {
    return "RBI INDIA " ;
  }
}
