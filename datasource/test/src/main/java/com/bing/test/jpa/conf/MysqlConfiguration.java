package com.bing.test.jpa.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <p>Title: MysqlConfiguration</p>
 * <p>Description: </p>
 *
 * @author bing
 * @date 2018/7/26
 * @Company 东方网力
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef="entityManagerFactoryPrimary",
        transactionManagerRef="transactionManagerPrimary",
        basePackages= { "com.bing.test.jpa.dao" })
public class MysqlConfiguration {
}
