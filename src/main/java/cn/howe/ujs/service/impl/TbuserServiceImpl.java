package cn.howe.ujs.service.impl;

import cn.howe.ujs.dao.TbuserMapper;
import cn.howe.ujs.model.Account;
import cn.howe.ujs.model.Tbuser;
import cn.howe.ujs.service.TbuserService;
import cn.howe.ujs.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
@Service
@Transactional
public class TbuserServiceImpl extends AbstractService<Tbuser> implements TbuserService {
    @Resource
    private TbuserMapper tbuserMapper;

    @Override
    public boolean isValidPassword(Account account) {
        Tbuser user = new Tbuser();
        user.setName(account.getUsername());
        user.setPassword(account.getPassword());
        List<Tbuser> reslist = tbuserMapper.select(user);
        if ( reslist != null &&  reslist.size()>0){
            System.out.println(reslist.toString());
            return true;
        }
        return false;
    }

    @Override
    public Tbuser getInfo(String username) {
        Tbuser tbuser = new Tbuser();
        tbuser.setName(username);
        List<Tbuser>  reslist = tbuserMapper.select(tbuser);
        if ( reslist != null &&  reslist.size()>0){
            return reslist.get(0);
        }
        return null;
    }
}
