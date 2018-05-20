package cn.howe.ujs.web.Api;

import cn.howe.ujs.core.ResultCode;
import cn.howe.ujs.core.ResultGenerator;
import cn.howe.ujs.model.Tbpolicegroup;
import cn.howe.ujs.model.WrapPolice;
import cn.howe.ujs.service.TbpoliceService;
import cn.howe.ujs.service.TbpolicegroupService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/strategy")
public class StrategyApi {

    @Autowired
    TbpoliceService tbpoliceService;

    @Autowired
    TbpolicegroupService tbpolicegroupService;

    @GetMapping("/getStrategyGroupList")
    public Object getStrategyGroupList(
            @RequestParam(required = false,defaultValue ="1") Integer currentPage){
        PageHelper.startPage(currentPage,5);
        List<Map> relList = tbpolicegroupService.getStrategyGroupList();
        PageInfo<List> pageInfo = new PageInfo(relList);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/getGroupList")
    public Object getGroupList(){
        List<Map> relList = tbpolicegroupService.getStrategyGroupList();
        return ResultGenerator.genSuccessResult(relList);
    }

    @GetMapping("/getStrategyDetail")
    public Object getStrategyDetail(@RequestParam Integer groupId){
        List<Map> resList = tbpoliceService.getDetailById(groupId);
        return ResultGenerator.genSuccessResult(resList);
    }

    @GetMapping("/getStrategyDetailByCycle")
    public Object getStrategyDetailByCycle(
            @RequestParam Integer groupId,
            @RequestParam Integer cycle){
        List<Map> resList = tbpoliceService.getDetailById(groupId,cycle);
        return ResultGenerator.genSuccessResult(resList);
    }

    @GetMapping("/changeGroupName")
    public Object changeGroupName(@RequestParam Integer groupId,
                                  @RequestParam String groupName){
        tbpolicegroupService.changeGroupName(groupId,groupName);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/deleteGroup")
    public Object deleteGroup(@RequestParam Integer groupId){
        tbpolicegroupService.deleteById(groupId);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/addGroup")
    public Object addGroup(@RequestParam String groupName){
        Tbpolicegroup tbpolicegroup = new Tbpolicegroup();
        tbpolicegroup.setGroupname(groupName);
        tbpolicegroupService.save(tbpolicegroup);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/deleteStrategy")
    public Object deleteStrategy(@RequestParam Integer strategyId){
        tbpoliceService.deleteById(strategyId);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/defaultStrategyCommit")
    public Object defaultStrategyCommit(@RequestBody WrapPolice params) throws ParseException {
        if (tbpoliceService.checkMonthRange(params)){
            return ResultGenerator.genOwnResult(ResultCode. MONTH_RANGE_FAIL,"请选择正确的月份范围");
        }
        tbpoliceService.saveDefaultStrategy(params);
       return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/weekendStrategyCommit")
    public Object weekendStrategyCommit(@RequestBody WrapPolice params) throws ParseException {
        tbpoliceService.saveWeekendStrategy(params);
        return ResultGenerator.genSuccessResult();
    }
}
