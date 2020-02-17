package com.zb.src.Service;


import com.zb.src.entity.User;

import java.util.List;


public interface Service {

    public List<User> showUser(String userName);

    public int deleteUser(String id);

}
