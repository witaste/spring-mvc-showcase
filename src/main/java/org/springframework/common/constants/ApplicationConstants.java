package org.springframework.common.constants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConstants {


	public static String SWAGGER_PATH;
	public static String SWAGGER_TITLE;
	public static String SWAGGER_DESCRIPTION;
	public static String SWAGGER_TERMSOFSERVICEURL;
	public static String SWAGGER_CONTACT;
	public static String SWAGGER_LICENSE;
	public static String SWAGGER_LICENSEURL;

	@Autowired(required = true)
	public void setSWAGGER_PATH(@Value("#{config['swagger.path']}") String SWAGGER_PATH) {
		ApplicationConstants.SWAGGER_PATH = SWAGGER_PATH;
	}
	@Autowired(required = true)
	public void setSWAGGER_TITLE(@Value("#{config['swagger.title']}") String SWAGGER_TITLE) {
		ApplicationConstants.SWAGGER_TITLE = SWAGGER_TITLE;
	}
	@Autowired(required = true)
	public void setSWAGGER_DESCRIPTION(@Value("#{config['swagger.description']}") String SWAGGER_DESCRIPTION) {
		ApplicationConstants.SWAGGER_DESCRIPTION = SWAGGER_DESCRIPTION;
	}
	@Autowired(required = true)
	public void setSWAGGER_TERMSOFSERVICEURL(@Value("#{config['swagger_termsofserviceurl']}") String SWAGGER_TERMSOFSERVICEURL) {
		ApplicationConstants.SWAGGER_TERMSOFSERVICEURL = SWAGGER_TERMSOFSERVICEURL;
	}
	@Autowired(required = true)
	public void setSWAGGER_CONTACT(@Value("#{config['swagger.contact']}") String SWAGGER_CONTACT) {
		ApplicationConstants.SWAGGER_CONTACT = SWAGGER_CONTACT;
	}
	@Autowired(required = true)
	public void setSWAGGER_LICENSE(@Value("#{config['swagger.license']}") String SWAGGER_LICENSE) {
		ApplicationConstants.SWAGGER_LICENSE = SWAGGER_LICENSE;
	}
	@Autowired(required = true)
	public void setSWAGGER_LICENSEURL(@Value("#{config['swagger.licenseurl']}") String SWAGGER_LICENSEURL) {
		ApplicationConstants.SWAGGER_LICENSEURL = SWAGGER_LICENSEURL;
	}
}
