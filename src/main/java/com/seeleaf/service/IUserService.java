package com.seeleaf.service;

import com.seeleaf.controller.dto.UserDTO;
import com.seeleaf.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author SeeLeaf
 * @since 2022-03-25
 */
public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);
}
