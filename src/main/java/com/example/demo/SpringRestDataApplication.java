package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.example.demo.model.EmployeeRepository;
import com.example.demo.model.SecurityUtils;
//import com.example.demo.model.UserRepo;


@SpringBootApplication
public class SpringRestDataApplication {

        @Autowired
	    EmployeeRepository employeeRepository;
 
	public static void main(String[] args) {
			  SpringApplication.run(SpringRestDataApplication.class, args);
		}
	
       public @PostConstruct void init() {
		SecurityUtils.runAs("system", "system", "ROLE_ADMIN");
		SecurityContextHolder.clearContext();
	}
	
	@Configuration
	@EnableGlobalMethodSecurity(prePostEnabled = true)
	@EnableWebSecurity
	static class SecurityConfiguration extends WebSecurityConfigurerAdapter {

		
		@Bean
		InMemoryUserDetailsManager userDetailsManager() {

			UserBuilder builder = User.withDefaultPasswordEncoder();
			UserDetails user1 = builder.username("ashishk").password("adminuser").roles("USER","ADMIN").build();
			UserDetails user2 = builder.username("aishwaryamp").password("user").roles("ADMIN").build();

			return new InMemoryUserDetailsManager(user1, user2);
		}
		
		@Override
		protected void configure(HttpSecurity http) throws Exception {

			http.httpBasic().and().authorizeRequests().//
					antMatchers(HttpMethod.POST, "/employee").hasRole("ADMIN").//
					antMatchers(HttpMethod.PUT, "/employee/**").hasRole("ADMIN").//
					antMatchers(HttpMethod.PATCH, "/employee/**").hasRole("ADMIN").and().//
					csrf().disable();
		}
	}
}
