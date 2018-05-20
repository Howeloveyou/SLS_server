package cn.howe.ujs.service;
import cn.howe.ujs.model.Account;
import cn.howe.ujs.model.Tbuser;
import cn.howe.ujs.core.Service;


/**
 * Created by CodeGenerator on 2018/05/02.
 */
public interface TbuserService extends Service<Tbuser> {
    boolean isValidPassword(Account account);

    Tbuser getInfo(String username);
}
