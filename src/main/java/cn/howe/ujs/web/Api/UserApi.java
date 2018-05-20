package cn.howe.ujs.web.Api;

import cn.howe.ujs.core.ResultGenerator;
import cn.howe.ujs.model.Tbuser;
import cn.howe.ujs.service.TbuserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserApi {
    @Resource
    private TbuserService tbuserService;

    @GetMapping("/info")
    public Object getInfo(@RequestParam String username){
        Tbuser user = tbuserService.getInfo(username);
        if ( user != null){
            HashMap<String,Object> resMap = new HashMap<>();
            List<String> resList = new ArrayList<>();
            resList.add(user.getRole());
            resMap.put("roles",resList);
            resMap.put("projectID",user.getProjectid());
            resMap.put("userId",user.getId());
            return ResultGenerator.genSuccessResult(resMap);
        }
        return ResultGenerator.genFailResult("无效用户名");
    }
}
