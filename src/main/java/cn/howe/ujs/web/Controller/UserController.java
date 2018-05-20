package cn.howe.ujs.web.Controller;

import cn.howe.ujs.core.ResultGenerator;
import cn.howe.ujs.model.Account;
import cn.howe.ujs.service.TbuserService;
import cn.howe.ujs.util.JwtUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
public class UserController {
    @Resource
    private TbuserService tbuserService;

    @PostMapping("/login")
    public Object login (@RequestBody Account account){
        HashMap<String,String> map = new HashMap<>();
        if (account.getUsername() != null
                && account.getPassword() != null
                && tbuserService.isValidPassword(account)){
            String jwt = JwtUtil.generateToken(account.getUsername());
            map.put("token",jwt);
            return ResultGenerator.genSuccessResult(map);
        }else {
            return ResultGenerator.genFailResult("账号或密码错误！");
        }
    }

}


