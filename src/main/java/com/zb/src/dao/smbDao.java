package com.zb.src.dao;

import com.zb.src.entity.User;

import java.util.List;

public interface smbDao {


    public List<User> showUser(String userName);

    public int deleteUser(String id);

}
