package com.sr.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import com.sr.Model.Note;

@Configuration
@EnableTransactionManagement
public class HibernateConfig
{
	@Bean
	 public DataSource GetDataSource()
	 {   
		 BasicDataSource bds = new BasicDataSource();
		 bds.setDriverClassName("com.mysql.jdbc.Driver");
		 bds.setUrl("jdbc:mysql://localhost:3306/NewDBUST");
		 bds.setUsername("root");
		 bds.setPassword("password@123");
		 return bds;
		 
	 }
	
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory(DataSource datasource) throws IOException
	{
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(datasource);
		
		Properties p = new Properties();
		
		p.put("hibernate.show_sql","true");
		p.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
		p.put("hibernate.hbm2ddl.auto","update");
		sessionFactoryBean.setHibernateProperties(p);
		sessionFactoryBean.setAnnotatedClasses(Note.class);
		sessionFactoryBean.afterPropertiesSet();
		return sessionFactoryBean;
	}
	
	 
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager tm = new HibernateTransactionManager();
		
		tm.setSessionFactory(sessionFactory);
       
		return tm;
		
		
		
	}
	
	
}