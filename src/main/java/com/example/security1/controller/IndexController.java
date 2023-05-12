package com.example.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  /*
  mustache 기본 폴더: src/main/resources
  view resolver: templates (prefix), .mustache (suffix)
  -> 이는 모두 spring 의존성 주입으로 자동으로 관리된다 (mustache 라이브러리)
  */
  @GetMapping({"","/"})
  public String index() {


    return "index";
  }

}
