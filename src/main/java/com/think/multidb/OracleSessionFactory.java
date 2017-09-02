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

import com.think.boot.mapper.oracle.OracleMapper;

@Configuration
@MapperScan(basePackageClasses = { OracleMapper.class }, sqlSessionFactoryRef = "oracleSqlSessionFactory")
public class OracleSessionFactory {

	@Autowired
	@Qualifier("oracle.datasource")
	private DataSource oracleDs;

	@Bean
	public SqlSessionFactory oracleSqlSessionFactory() throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(oracleDs);

		return factoryBean.getObject();

	}

	@Bean
	public DataSourceTransactionManager oracleTransactionManager(
			@Qualifier("oracle.datasource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean
	public SqlSessionTemplate oracleSqlSessionTemplate() throws Exception {
		SqlSessionTemplate template = new SqlSessionTemplate(
				oracleSqlSessionFactory()); // 使用上面配置的Factory
		return template;
	}
}