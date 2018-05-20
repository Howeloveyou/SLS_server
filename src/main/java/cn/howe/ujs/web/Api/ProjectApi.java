package cn.howe.ujs.web.Api;

import cn.howe.ujs.core.ResultGenerator;
import cn.howe.ujs.service.*;
import cn.howe.ujs.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/project")
public class ProjectApi {

    @Autowired
    private TbprojectService tbprojectService;

    @Autowired
    private TbrouteService tbrouteService;

    @Autowired
    private TbconcentratorService tbconcentratorService;

    @Autowired
    private TbcircuitService tbconcentratorcircuitService;

    @Autowired
    private TbgroupService tbgroupService;

    @Autowired
    private TbcontrollerService tbcontrollerService;

    @Autowired
    private TbturnorderService tbturnorderService;

    @Autowired
    private TborderService tborderService;


    @GetMapping("/getProjectList")
    public Object getProjectList(@RequestParam Integer projectId){
        List<Map> resList;
        if (0 == projectId){
            resList = tbprojectService.getProjectList();
        }else {
            resList = tbprojectService.getProject(projectId);
        }
        return ResultGenerator.genSuccessResult(resList);
    }

    @GetMapping("/getRouteList")
    public Object getRouteList(@RequestParam Integer projectId){
        List<Map> resList = tbrouteService.getRouteList(projectId);
        return ResultGenerator.genSuccessResult(resList);
    }

    @GetMapping("/getConcentratorList")
    public Object getConcentratorList(@RequestParam Integer routeId){
        List<Map> resList = tbconcentratorService.getConcentratorList(routeId);
        return ResultGenerator.genSuccessResult(resList);
    }

    @GetMapping("/getCircuitList")
    public Object getCircuitList(String concentratorIds){
        //System.out.println(concentratorIds);
        if ("".equals(concentratorIds) || concentratorIds == null ){
            return ResultGenerator.genSuccessResult();
        }
        String [] arrs = concentratorIds.split(",");
        //System.out.println(arrs);
        List<Map> resList = tbconcentratorcircuitService.getCircuitList(arrs);
        return ResultGenerator.genSuccessResult(resList);
    }

    @GetMapping("/getGroupList")
    public Object getGroupList(String circuitIds){
        System.out.println(circuitIds);
        if ("".equals(circuitIds) || circuitIds == null ){
            return ResultGenerator.genSuccessResult();
        }
        String [] arrs = circuitIds.split(",");
        //System.out.println(arrs);
        List<Map> resList = tbgroupService.getGroupList(arrs);
        return ResultGenerator.genSuccessResult(resList);
    }

    @GetMapping("/getControllerList")
    public Object getControllerList(String groupIds){
        System.out.println(groupIds);
        if ("".equals(groupIds) || groupIds == null ){
            return ResultGenerator.genSuccessResult();
        }
        String [] arrs = groupIds.split(",");
        //System.out.println(arrs);
        List<Map> resList = tbcontrollerService.getControllerList(arrs);
        return ResultGenerator.genSuccessResult(resList);
    }

    @GetMapping("/turnOnLamp")
    public Object turnOnLamp(String chooseControllerIds,
                             String doneTime,
                             Byte lumaLevel,
                             Integer userId) throws ParseException {
        //System.out.println(doneTime);
        String [] relChooseControllerIds = chooseControllerIds.split(",");
        Date relDoneTime = DateUtil.stringToDate(doneTime);
        tborderService.turnOnLamp(relChooseControllerIds,relDoneTime,userId);
        tbturnorderService.turnOnLamp(relChooseControllerIds,relDoneTime,userId,lumaLevel);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/turnOffLamp")
    public Object turnOffLamp(String chooseControllerIds,
                              String doneTime,
                              Integer userId) throws ParseException {
        String [] relChooseControllerIds = chooseControllerIds.split(",");
        Date relDoneTime = DateUtil.stringToDate(doneTime);
        tborderService.turnOffLamp(relChooseControllerIds,relDoneTime,userId);
        tbturnorderService.turnOffLamp(relChooseControllerIds,relDoneTime,userId);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/turnOnCircuit")
    public Object turnOnCircuit(String chooseCircuitIds,
                              String doneTime,
                              Integer userId) throws ParseException {
        String [] relChooseCircuitIds = chooseCircuitIds.split(",");
        Date relDoneTime = DateUtil.stringToDate(doneTime);
        tborderService.turnOnCircuit(relChooseCircuitIds,relDoneTime,userId);
        tbturnorderService.turnOnCircuit(relChooseCircuitIds,relDoneTime,userId);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/turnOffCircuit")
    public Object turnOffCircuit(String chooseCircuitIds,
                                String doneTime,
                                Integer userId) throws ParseException {
        String [] relChooseCircuitIds = chooseCircuitIds.split(",");
        Date relDoneTime = DateUtil.stringToDate(doneTime);
        tborderService.turnOffCircuit(relChooseCircuitIds,relDoneTime,userId);
        tbturnorderService.turnOffCircuit(relChooseCircuitIds,relDoneTime,userId);
        return ResultGenerator.genSuccessResult();
    }
}
