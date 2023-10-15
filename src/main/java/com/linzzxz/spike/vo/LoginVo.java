package com.linzzxz.spike.vo;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class LoginVo {
    private String mobile;
    private String password;
}
