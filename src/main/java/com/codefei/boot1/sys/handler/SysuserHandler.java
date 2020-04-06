package com.codefei.boot1.sys.handler;


import com.codefei.boot1.common.MyTask;
import com.codefei.boot1.sys.entity.Sysuser;
import com.codefei.boot1.sys.service.ISysuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class SysuserHandler {

    @Autowired
    private  ISysuserService us;
    @Autowired
    private MyTask mt;

    @RequestMapping("boot")
    public String goBoot(Model model, HttpSession session,HttpServletRequest req){
        ServletContext servletContext = req.getServletContext();
        servletContext.setAttribute("sc","servletContext全局数据");
        session.setAttribute("s","session会话数据");
        model.addAttribute("d","test请求数据");
        return  "boot";
    }
    @RequestMapping("boot2")
    public String goBoot2(){
        return  "boot2";
    }
  @RequestMapping("{uid}")
    public Sysuser queryUser(@PathVariable int uid){
      return  us.queryUserById(uid);
  }

}
