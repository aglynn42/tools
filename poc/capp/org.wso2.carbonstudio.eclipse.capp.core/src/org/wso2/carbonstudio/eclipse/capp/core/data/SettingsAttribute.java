/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbonstudio.eclipse.capp.core.data;

import org.wso2.carbonstudio.eclipse.capp.core.artifacts.configure.ISettingsAttribute;

public class SettingsAttribute implements ISettingsAttribute {
	private String attributeName;
	private String attributeValue;

	public SettingsAttribute(String attributeName, String attributeValue) {
		setAttributeName(attributeName);
		setAttributeValue(attributeValue);
    }
	
	public String getAttributeName() {
		return attributeName;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName=attributeName;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue=attributeValue;
	}

}
