package com.linzzxz.spike.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.linzzxz.spike.pojo.User;
import com.linzzxz.spike.vo.LoginVo;
import com.linzzxz.spike.vo.RespBean;

public interface IUserService extends IService<User> {

    RespBean doLogin(LoginVo loginVo);
}
