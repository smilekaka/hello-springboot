package com.hello.springboot.hellospringboot.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@EnableOAuth2Sso
//@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig /*extends WebSecurityConfigurerAdapter*/ {

//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.cors().and()
////                .csrf().disable()
////		        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED).and().antMatcher("/**")
//                .authorizeRequests()
//                //跨域请求会先进行一次options请求
//                .antMatchers(HttpMethod.OPTIONS).permitAll()
//                .antMatchers("/", "/login**").permitAll()
//                .anyRequest()
//                .authenticated();
//
////        允许所有应用请求
////        http.csrf().disable()
//////		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED).and()
////                .authorizeRequests().antMatchers(HttpMethod.OPTIONS).permitAll()// 跨域请求会先进行一次options请求
////                .anyRequest().permitAll().and().logout().permitAll();
////        http.headers().cacheControl();
//    }

}
