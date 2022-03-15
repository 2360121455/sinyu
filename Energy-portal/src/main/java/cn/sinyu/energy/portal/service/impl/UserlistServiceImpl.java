package cn.sinyu.energy.portal.service.impl;

import cn.sinyu.energy.portal.dto.UserlistRegisterDTO;
import cn.sinyu.energy.portal.ex.AccountDuplicateException;
import cn.sinyu.energy.portal.ex.InsertException;
import cn.sinyu.energy.portal.ex.UsernameDuplicateException;
import cn.sinyu.energy.portal.mapper.UserlistMapper;
import cn.sinyu.energy.portal.model.Userlist;
import cn.sinyu.energy.portal.service.IUserlistService;
import cn.sinyu.energy.portal.util.PasswordUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zcd
 * @since 2022-03-03
 */
@Service
public class UserlistServiceImpl extends ServiceImpl<UserlistMapper, Userlist> implements IUserlistService {

    @Autowired
    UserlistMapper ulmapper;

    /**
     * 注册实现类
     * @param userlistRegisterDTO 用户传输参数封装类
     */
    @Override
    public void Register(UserlistRegisterDTO userlistRegisterDTO){

        //根据客户端输入的用户名查询用户
        QueryWrapper<Userlist> qw = new QueryWrapper<>();
        qw.eq("user_name",userlistRegisterDTO.getUsername());
        List<Userlist> ulList = ulmapper.selectList(qw);
        //判断查询结果是否为null
        if (!ulList.isEmpty()){
            //抛出用户名重复异常
            throw new UsernameDuplicateException();
        }

        //根据客户端输入的账号查询用户
        QueryWrapper<Userlist> qwa = new QueryWrapper<>();
        qwa.eq("account",userlistRegisterDTO.getAccount());
        List<Userlist> ulaList = ulmapper.selectList(qwa);
        //判断查询结果是否为null
        if (!ulaList.isEmpty()){
            //抛出账户重复异常
            throw new AccountDuplicateException();
        }

        //创建UserList对象
        Userlist user = new Userlist();
        //补全UserList对象的属性值

        user.setUserName(userlistRegisterDTO.getUsername());
        user.setAccount(userlistRegisterDTO.getAccount());
        //对密码进行md5加密
        user.setPassword(PasswordUtils.encode(userlistRegisterDTO.getPassword()));
        user.setUserCode(UUID.randomUUID().toString());
        //将补全后的Userlist对象插入数据库中,返回受影响行数
        int rows = ulmapper.insert(user);
        if (rows != 1){
            //抛出插入数据异常
            throw new InsertException();
        }
    }
}
