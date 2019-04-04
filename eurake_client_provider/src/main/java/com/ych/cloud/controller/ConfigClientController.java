package com.ych.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ych.cloud.entity.User;
@RestController
public class ConfigClientController {
  //@Value("${profile}")
  private String profile="QQQ";

  @GetMapping("/profile")
  public String hello() {
    return this.profile;
  }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setName("ych");
        return user;
    }
}
