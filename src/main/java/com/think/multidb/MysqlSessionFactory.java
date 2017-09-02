package com.think.multidb;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.think.boot.mapper.mysql.MysqlMapper;

@Configuration
@MapperScan(basePackageClasses = { MysqlMapper.class }, sqlSessionFactoryRef = "mysqlSqlSessionFactory")
public class MysqlSessionFactory {

	@Autowired
	@Qualifier("mysql.datasource")
	private DataSource mysqlDs;

	/**
	 * mysql会话工厂
	 * 
	 * @return
	 * @throws Exception
	 */
	@Bean
	public SqlSessionFactory mysqlSqlSessionFactory() throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(mysqlDs);

		return factoryBean.getObject();

	}

	/**
	 * mysql事务管理
	 * 
	 * @param dataSource
	 * @return
	 */
	@Bean
	public DataSourceTransactionManager mysqlTransactionManager(
			@Qualifier("mysql.datasource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	/**
	 * mysql会话模板
	 * 
	 * @return
	 * @throws Exception
	 */
	@Bean
	public SqlSessionTemplate mysqlSqlSessionTemplate() throws Exception {
		SqlSessionTemplate template = new SqlSessionTemplate(
				mysqlSqlSessionFactory()); // 使用上面配置的Factory
		return template;
	}
}