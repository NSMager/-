package com.zb.src.Service;

import com.zb.src.dao.smbDao;
import com.zb.src.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements  Service {

  @Autowired
  smbDao smbdao;

    @Override
    public List<User> showUser(String userName) {
        return smbdao.showUser(userName) ;
    }

  @Override
  public int deleteUser(String id) {
    return smbdao.deleteUser(id);
  }
}
