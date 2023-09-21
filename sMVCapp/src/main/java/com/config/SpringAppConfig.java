package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com")
/*	public class SpringAppConfig {
		@Bean
		public InternalResourceViewResolver viewResolver() {
			InternalResourceViewResolver vw = new InternalResourceViewResolver();
			vw.setPrefix("/WEB-INF/jsp/");
			vw.setSuffix(".jsp");
			return vw;
		}
	}	*/
public class SpringAppConfig implements WebMvcConfigurer{
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/jsp/", ".jsp");
	}
	@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/statics/");
		}
	@Bean
	DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName( "com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/wordcount");
		ds.setUsername("root");
		ds.setPassword("");
		return ds;
	}
	@Bean
	 public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate((javax.sql.DataSource) getDataSource());
	}
}
