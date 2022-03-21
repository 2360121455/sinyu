package cn.sinyu.energy.portal.service.impl;

import cn.sinyu.energy.portal.dto.UserlistLoginDTO;
import cn.sinyu.energy.portal.dto.UserlistRegisterDTO;
import cn.sinyu.energy.portal.ex.*;
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
     * 实现注册
     * @param userlistRegisterDTO
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
            throw new UsernameDuplicateException("注册失败，用户名已经存在！");
        }
        //根据客户端输入的账号查询用户
        QueryWrapper<Userlist> qwa = new QueryWrapper<>();
        qwa.eq("account",userlistRegisterDTO.getAccount());
        List<Userlist> ulaList = ulmapper.selectList(qwa);
        //判断查询结果是否为null
        if (!ulaList.isEmpty()){
            //抛出账户重复异常
            throw new AccountDuplicateException("注册失败，账号已经存在");
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
            throw new InsertException("注册失败，服务器忙，请稍后重试！");
        }
    }

    /**
     * 登录实现
     * @param userlistLoginDTO
     */
    @Override
    public void Login(UserlistLoginDTO userlistLoginDTO){
        //根据客户端输入的账号查询用户
        QueryWrapper<Userlist> qw = new QueryWrapper<>();
        qw.eq("account",userlistLoginDTO.getAccount());
        List<Userlist> ulList = ulmapper.selectList(qw);
        //判断查询结果是否为null
        if (ulList.isEmpty()){
            //抛出账号不存在异常
            throw new AccountInexistenceException();
        }
        for (Userlist u:ulList) {
            //查询密码是否正确
            String Md5PasswordDTO = PasswordUtils.encode(userlistLoginDTO.getPassword());
            if (!u.getPassword().equals(Md5PasswordDTO)){
                //抛出密码错误异常
                throw new WrongPasswordException();
            }
        }
    }
}
