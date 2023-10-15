package com.linzzxz.spike.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linzzxz.spike.mapper.UserMapper;
import com.linzzxz.spike.pojo.User;
import com.linzzxz.spike.service.IUserService;
import com.linzzxz.spike.utils.MD5;
import com.linzzxz.spike.utils.Validator;
import com.linzzxz.spike.vo.LoginVo;
import com.linzzxz.spike.vo.RespBean;
import com.linzzxz.spike.vo.RespBeanEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public RespBean doLogin(LoginVo loginVo) {
        String phoneNum = loginVo.getMobile();
        String password = loginVo.getPassword();
        if (StringUtils.isEmpty(phoneNum) || StringUtils.isEmpty(password))
            return RespBean.error(RespBeanEnum.LOGIN_ERROR);
        if (!Validator.verifyPhoneNum(phoneNum))
            return RespBean.error(RespBeanEnum.PHONE_NUM_ERROR);

        User user = userMapper.selectById(phoneNum);
        if (null == user) {
            return RespBean.error(RespBeanEnum.LOGIN_ERROR);
        }
        if (!MD5.encryptPass(password, user.getSalt()).equals(user.getPassword())){
            log.info("{}", MD5.encryptPass(password, user.getSalt()));
            log.info("{}", user.getSalt());
            return RespBean.error(RespBeanEnum.LOGIN_ERROR);
        }

        return RespBean.success();
    }
}
