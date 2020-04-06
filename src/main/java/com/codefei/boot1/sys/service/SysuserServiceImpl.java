package com.codefei.boot1.sys.service;

import com.codefei.boot1.sys.entity.Sysuser;
import org.springframework.stereotype.Service;

@Service
public class SysuserServiceImpl implements ISysuserService {
    @Override
    public Sysuser queryUserById(int uid) {

       Sysuser user=new Sysuser();
       user.setUid(uid);
       user.setUname("测试名"+uid);
       user.setUphone("111111");
        return user;
    }
}
