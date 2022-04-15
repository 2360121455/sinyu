package cn.sinyu.energy.portal.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsServiceImpl userDetailsService;


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //配置身份验证
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //访问控制
        String[] urls = {
                "/login.html",
                "/login",
                "/register.html",
                "/portal/userlist/register",
                "/static/**",
                "/js/**",
                "/lib/**",
                "/temp/**",
                "/favicon.ico"
        };

        //formLogin() > 通过登录表单验证用户登录
        //loginProcessingUrl() > form表单指定提交的url
        //loginPage() > 自定义登录页
        http.formLogin()
                .loginProcessingUrl("/login")
                .loginPage("/login.html");
        //authorizeRequests() > 对请求进行授权
        //antMatchers() > 设置某一些路径
        //permitAll() > 直接许可，不需要验证
        //anyRequest() > 任意请求路径，如果此前通过其他API配置了路径，则标识“除了以上路径意外的其他任意请求路径”
        //authenticated() > 要求授权
        http.authorizeRequests()
                .antMatchers(urls).permitAll()
                .anyRequest().authenticated();

        //关闭跨域攻击
        http.csrf()//跨域
                .disable()//关闭
                .headers()//请求头设置
                .frameOptions().disable();//允许嵌套页面
    }
}
