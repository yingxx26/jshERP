/**
 * 
 */
package com.jsh.erp.config;


import com.jsh.erp.properties.SecurityProperties;
import com.jsh.erp.testutil.TestDate;
import com.jsh.erp.testutil.TestDate1;
import com.jsh.erp.testutil.TestDate2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;


import javax.sql.DataSource;

/**
 * 社交登录配置主类
 * 
 * @author zhailiang
 *
 */
@Configuration
public class TestDateConfig {

	 @Autowired
	private SecurityProperties securityProperties;


	@Bean
	@ConditionalOnProperty(prefix = "imooc.security", name = "jdkversion")
	public TestDate testDatejdk  () {
		String jdkversion = securityProperties.getJdkversion();
		TestDate t=null;
		if("jdk7".equals(jdkversion)){
			t=new TestDate1();
		} else
		{
			t=new TestDate2();
		}

		return t;
	}


}
