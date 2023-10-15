package com.linzzxz.spike.controller;

import com.linzzxz.spike.service.IUserService;
import com.linzzxz.spike.vo.LoginVo;
import com.linzzxz.spike.vo.RespBean;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {

    @Autowired
    private IUserService userService;
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/doLogin")
    @ResponseBody
    public RespBean doLogin(LoginVo loginVo) {
        log.info("{}", loginVo);
        return userService.doLogin(loginVo);
    }
}
