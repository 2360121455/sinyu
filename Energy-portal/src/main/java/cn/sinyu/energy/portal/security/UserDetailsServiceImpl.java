package cn.sinyu.energy.portal.security;

import cn.sinyu.energy.portal.VO.permissionVO;
import cn.sinyu.energy.portal.VO.UserLoginVO;
import cn.sinyu.energy.portal.service.impl.UserlistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserlistServiceImpl userlistService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //调用业务层根据登录账号查询用户信息
        UserLoginVO userLoginVO = userlistService.Login(s);
        //如果查询为空返回null，则登录失败
        if(userLoginVO == null){
            return null;
        }
        //从查询结果中取出权限数据，封装为Spring Security需要的类型
        List<GrantedAuthority> authorities = new ArrayList<>();
        List<permissionVO> permissions = userLoginVO.getPermissions();
        for (permissionVO permission: permissions) {
            String authority = permission.getAuthority();
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority);
            authorities.add(grantedAuthority);
        }
        //创建LoginUserInfo对象，准备作为返回给Spring Security的对象
        LoginUserInfo loginUserInfo = new LoginUserInfo(
                userLoginVO.getAccount(),
                userLoginVO.getPassword(),
                authorities
        );
        loginUserInfo.setUserCode(userLoginVO.getUserCode());
        loginUserInfo.setUsername(userLoginVO.getUserName());
        //返回
        return loginUserInfo;
    }
}
