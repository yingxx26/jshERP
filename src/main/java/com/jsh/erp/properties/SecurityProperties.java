/**
 * 
 */
package com.jsh.erp.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhailiang
 *
 */
@ConfigurationProperties(prefix = "imooc.security")
public class SecurityProperties {

	private String jdkversion = "jdk8";

	public String getJdkversion() {
		return jdkversion;
	}

	public void setJdkversion(String jdkversion) {
		this.jdkversion = jdkversion;
	}
}

