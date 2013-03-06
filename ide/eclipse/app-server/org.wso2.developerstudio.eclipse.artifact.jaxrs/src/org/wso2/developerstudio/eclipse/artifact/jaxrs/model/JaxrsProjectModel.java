/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.artifact.jaxrs.model;

import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class JaxrsProjectModel  extends ProjectDataModel {
	
	private String serviceClass;
	private String serviceClassPackage;
	
	public void setServiceClassPackage(String serviceClassPackage) {
		this.serviceClassPackage = serviceClassPackage;
	}
	public String getServiceClassPackage() {
		return serviceClassPackage;
	}
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}
	public String getServiceClass() {
		return serviceClass;
	}
	
	public Object getModelPropertyValue(String key) {
		Object modelPropertyValue = super.getModelPropertyValue(key);
		if (modelPropertyValue == null) {
			if (key.equals("service.class.package.name")) {
				modelPropertyValue = getServiceClassPackage();
			} else if (key.equals("service.class.name")) {
				modelPropertyValue = getServiceClass();
			} 
		}
		return modelPropertyValue;
	}

	
	public boolean setModelPropertyValue(String key, Object data) throws ObserverFailedException {
		boolean returnValue = super.setModelPropertyValue(key, data);
		if (key.equals("service.class.package.name")) {
			setServiceClassPackage(data.toString());
		} else if (key.equals("service.class.name")) {
			setServiceClass(data.toString());
		} 
		return returnValue;
	}

}
