package com.codefei.boot2.sys.handler;

import com.alibaba.fastjson.JSON;
import com.codefei.boot2.sys.entity.BestvCategory;
import com.codefei.boot2.sys.mapper.BestvCategoryMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@RestController
public class SysuserHandler {
    private Logger l = LoggerFactory.getLogger(SysuserHandler.class);

    @Autowired
    private BestvCategoryMapper bm;

    @Autowired
    private RedisTemplate<Object, Object> rt;

    @Autowired
    private StringRedisTemplate srt;
    final String key = "userinfo:";

    @GetMapping("/users/{uid}")
    public BestvCategory selectByKey(@PathVariable int uid) {
        BestvCategory bestvCategory = null;
        ValueOperations<Object, Object> vo = rt.opsForValue();
        String ukey = key + uid;
        Object o = vo.get(ukey);
        if (o == null) {
            bestvCategory = bm.selectByPrimaryKey(uid);
            vo.set(ukey, bestvCategory);
        } else {
            bestvCategory = (BestvCategory) o;
        }
        return bestvCategory;
    }

    @GetMapping("/user2/{uid}")
    public BestvCategory selectKey(@PathVariable int uid) {
        BestvCategory bestvCategory = null;
        ValueOperations<String, String> vo = srt.opsForValue();
        String ukey = key + uid;
        String o = vo.get(ukey);
        if (o == null) {
            bestvCategory = bm.selectByPrimaryKey(uid);
            vo.set(ukey, JSON.toJSONString(bestvCategory));
        } else {
            bestvCategory = JSON.parseObject(o, BestvCategory.class);
        }
        return bestvCategory;
    }

    @GetMapping("/u/{uid}")
    public BestvCategory selectByPrimaryKey(@PathVariable int uid) {
        BestvCategory bestvCategory = bm.selectByPrimaryKey(uid);
        return bestvCategory;

    }

    @GetMapping("/t")
    public String test(Date d) {
//        l.info("test方法");
        int i = 1 / 0;
        System.out.println("----SysUserHandler---");
        return "login";

    }

    @GetMapping("/user")
    public PageInfo<BestvCategory> selectBestvCategory(@RequestParam(defaultValue = "1") int pageNumber, @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        List<BestvCategory> bestvCategories = bm.selectBestvCategory();
        PageInfo<BestvCategory> bilst = new PageInfo<>(bestvCategories);
        return bilst;

    }
}
