package com.codefei.boot2.sys.handler;

import com.codefei.boot2.sys.entity.BestvCategory;
import com.codefei.boot2.sys.mapper.BestvCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysuserHandler2 {

    @Autowired
    private BestvCategoryMapper bm;

    @GetMapping("/user3/{uid}")
    @Cacheable(cacheNames = "userinfo:", key = "#uid", unless = "#result==null")
    public BestvCategory selectByPrimaryKey3(@PathVariable int uid) {
        BestvCategory bestvCategory = bm.selectByPrimaryKey(uid);
        return bestvCategory;
    }


    @GetMapping("/del/{uid}")
    @CacheEvict(cacheNames = "userinfo:", key = "#uid")//修改删除数据库时，删除缓存
    public int delByPrimaryKey3(@PathVariable int uid) {
        int i = bm.deleteByPrimaryKey(uid);
        return i;
    }

}
