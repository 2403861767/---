package com.seeleaf.controller.dto;

import lombok.Data;

/***
 *  接收前端登入的账户和密码
 */
@Data
public class UserDTO {
    private String username;
    private String password;
    private String nickname;
    private String avatarUrl;
    private String token;
}
