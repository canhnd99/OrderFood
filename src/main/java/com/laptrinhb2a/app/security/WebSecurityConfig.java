package com.laptrinhb2a.app.security;

import com.laptrinhb2a.app.service.impl.AdminDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    AdminDetailsService adminDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(adminDetailsService);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(
            "/css/*", "/images/*", "/js/*", "/vendor/*", "/font/*"
        );
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                authorizeRequests()
                    .antMatchers("/admin*", "/admin/*")
                    .hasRole("ADMIN")
                    .and()
                .formLogin()
                    .loginPage("/login")
                    .defaultSuccessUrl("/admin")
                    .failureUrl("/login?error=loginError")
                    .and()
                .logout()
                    .logoutUrl("/logout")
                    .and()
                .exceptionHandling()
                    .accessDeniedPage("/404")
                    .and()
                .csrf().disable();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder;
    }
}
