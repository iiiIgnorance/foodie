package com.imooc.service;

import com.imooc.pojo.Stu;
import com.imooc.pojo.Users;
import com.imooc.pojo.bo.UserBO;

public interface UserService {
//  判断用户名是否存在
    public boolean queryUsernameIsExist(String username);
//  创建用户
    public Users createUser(UserBO userBO);
//  判断用户是否存在
    public Users queryUserForLogin(String username, String password);
}
