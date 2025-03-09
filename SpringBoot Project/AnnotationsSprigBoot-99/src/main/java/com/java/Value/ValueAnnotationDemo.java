//package com.java.Value;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import com.java.scope.Protype;
////
////@Component
////public class ValueAnnotationDemo {
////	@Value("${mail.host}")
////	private String host;
////	@Value("${mail.email}")
////	private String email;
////	@Value("${mail.password}")
////	private String password;
////	@Value("${java.home}")
////	private String javaHome;
////	@Value("${HOME}")
////	private String homeDir;
////	
////	
////	
//	


	@Value("Default Name")
	private String defaultName;

	public String getDefaultName() {
		return defaultName;
	}

	public String getHost() {
		return host;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getJavaHome() {
		return javaHome;
	}

	public String getHomeDir() {
		return homeDir;
	}
	

}
