/**
 * 
 */
package com.jsh.erp.config;

 import com.jsh.erp.properties.SecurityProperties;
 import com.jsh.erp.testutil.TestDate;
 import com.jsh.erp.testutil.TestDate2;
 import org.springframework.boot.context.properties.EnableConfigurationProperties;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;

/**
 * @author zhailiang
 *
 */
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {
    @Bean
    public SecurityProperties securityProperties () {

        return new SecurityProperties();
    }
}
