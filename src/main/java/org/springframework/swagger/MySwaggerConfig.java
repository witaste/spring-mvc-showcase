package org.springframework.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.common.constants.ApplicationConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

@Configuration
@EnableWebMvc
@EnableSwagger
//@ComponentScan("org.springframework.")
public class MySwaggerConfig {

	private SpringSwaggerConfig springSwaggerConfig;

	   @Autowired
	   public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
	      this.springSwaggerConfig = springSwaggerConfig;
	   }

	   @Bean //Don't forget the @Bean annotation
	   public SwaggerSpringMvcPlugin customImplementation(){
	      return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
	            .apiInfo(apiInfo())
	            .includePatterns(".*?");
	   }

	    private ApiInfo apiInfo() {
	      ApiInfo apiInfo = new ApiInfo(
	              ApplicationConstants.SWAGGER_TITLE,
	              ApplicationConstants.SWAGGER_DESCRIPTION,
	              ApplicationConstants.SWAGGER_TERMSOFSERVICEURL,
	              ApplicationConstants.SWAGGER_CONTACT,
	              ApplicationConstants.SWAGGER_LICENSE,
	              ApplicationConstants.SWAGGER_TERMSOFSERVICEURL
	        );
	      return apiInfo;
	    }
}
