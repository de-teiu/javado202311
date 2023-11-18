package com.example.demo.application.settings;

import java.io.IOException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//@org.springframework.transaction.annotation.EnableTransactionManagementを付与し、
//アノテーション駆動(@Transactional)のトランザクション制御を有効にします。
@EnableTransactionManagement
//@org.mybatis.spring.annotation.MapperScanを付与し、Mapperインターフェースのスキャンを有効にします。
@MapperScan("com.example.demo.domain.mapper")
public class MyBatisConfig {

	@Autowired
	protected ResourceLoader resourceLoader;

	@Autowired
	DataSource dataSource;

	// org.mybatis.spring.SqlSessionFactoryBeanをBean定義します。
	// これによりSqlSessionFactoryBeanを利用してSqlSessionFactoryが生成されます。
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		// データソースを設定する。MyBatisの処理の中でSQLを発行すると、
		// ここで指定したデータソースからコネクションが取得されます。
		try {
			Resource[] res = ResourcePatternUtils.getResourcePatternResolver(resourceLoader)
					.getResources("classpath:/mybatis-config.xml");
			sessionFactoryBean.setConfigLocation(res[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sessionFactoryBean.setDataSource(dataSource);

		return sessionFactoryBean;
	}

	// トランザクションマネージャーのBeanを定義します。
	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}
}