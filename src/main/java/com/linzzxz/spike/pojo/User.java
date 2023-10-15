package com.linzzxz.spike.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author lin
 * @since 2023-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * user id(phone number)
     */
    private Long id;

    private String name;

    /**
     * MD5(MD5(pswd+salt)+salt)
     */
    private String password;

    private String salt;

    private String avatar;

    private Date registerDate;

    private Date lastLoginDate;

    private Integer loginCount;


}
