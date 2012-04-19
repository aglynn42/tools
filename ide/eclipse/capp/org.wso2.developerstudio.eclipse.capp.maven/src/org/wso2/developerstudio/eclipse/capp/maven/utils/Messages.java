package org.wso2.developerstudio.eclipse.capp.maven.utils;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.wso2.developerstudio.eclipse.capp.maven.utils.messages"; //$NON-NLS-1$
	public static String MAVEN_LIBRARY_PLUGIN_VERSION;
	public static String MAVEN_SYNAPSE_MEDIATOR_PLUGIN_VERSION;
	public static String MAVEN_REGISTRY_RESOURCE_VERSION;
	public static String MAVEN_CAR_VERSION;
	public static String MAVEN_ENDPOINT_VERSION;
	public static String MAVEN_LOCAL_ENTRY_VERSION;
	public static String MAVEN_PROXY_SERVICE_VERSION;
	public static String MAVEN_REG_FILTERS_VERSION;
	public static String MAVEN_SEQUENCE_VERSION;
	public static String MAVEN_REGISTRY_HANDLER_PLUGIN_VERSION;
	public static String MAVEN_AXIS2_PLUGIN_VERSION;
	public static String MAVEN_WAR_PLUGIN_VERSION;
	public static String MAVEN_CARBON_UI_PLUGIN_VERSION;
	public static String MAVEN_DATASERVICE_PLUGIN_VERSION;
	public static String MAVEN_BPEL_PLUGIN_VERSION;
	public static String MAVEN_DS_VALIDATOR_PLUGIN_VERSION;
	public static String MAVEN_GADGET_PLUGIN_VERSION;
	public static String MAVEN_JAXWS_PLUGIN_VERSION;
	public static String MAVEN_SYNAPSE_VERSION;
	public static String WSO2_ESB_ENDPOINT_VERSION;
	public static String WSO2_ESB_LOCAL_ENTRY_VERSION;
	public static String WSO2_ESB_PROXY_VERSION;
	public static String WSO2_ESB_SEQUENCE_VERSION;
	public static String WSO2_ESB_SYNAPSE_VERSION;
	public static String WSO2_GENERAL_PROJECT_VERSION;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
