package com.shang.account;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 *
 * @author zengrenshang
 * @since 2020/12/4 10:18
 */
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.shang.account.mapper")
@EnableFeignClients
@EnableDiscoveryClient
@EnableTransactionManagement
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

}
