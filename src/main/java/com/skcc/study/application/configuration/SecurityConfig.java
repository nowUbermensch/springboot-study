package com.skcc.study.application.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// @formatter:off
		http
			.formLogin()
				.loginPage("/user/login") //구현해야된다.
			.and()
				.logout()
					.logoutUrl("/user/logout") //구현해야된다.
					.deleteCookies("JSESSIONID")
					.logoutSuccessUrl("/product/list") //로그아웃 시 초기화 페이지
			.and()
				.authorizeRequests()
					.antMatchers("/**/write*", "/**/edit*", "/**/delete*").authenticated()
					.antMatchers("/**").permitAll();
		// @formatter:on
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/h2-console/**"); //h2 Console Url
	}
}
