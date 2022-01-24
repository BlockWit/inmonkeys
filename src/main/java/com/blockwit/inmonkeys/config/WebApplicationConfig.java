package com.blockwit.inmonkeys.config;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebApplicationConfig {

	@Value("${http.server.port}")
	private Integer httpServerPort;

	@Value("${https.server.port}")
	private Integer httpsServerPort;

	@Value("${security.require-ssl}")
	private Boolean requiresSSL;

	@Bean
	public ServletWebServerFactory servletContainer() {
		final TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {

			@Override
			protected void postProcessContext(Context context) {
				if (requiresSSL) {
					final SecurityConstraint securityConstraint = new SecurityConstraint();
					securityConstraint.setUserConstraint("CONFIDENTIAL");

					final SecurityCollection collection = new SecurityCollection();
					collection.addPattern("/*");
					securityConstraint.addCollection(collection);
					context.addConstraint(securityConstraint);
				}
			}
		};
		if (requiresSSL) {
			tomcat.addAdditionalTomcatConnectors(redirectConnector());
		}
		return tomcat;
	}

	private Connector redirectConnector() {
		final Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setScheme("http");
		connector.setPort(httpServerPort);
		connector.setSecure(false);
		connector.setRedirectPort(httpsServerPort);
		return connector;
	}

}

