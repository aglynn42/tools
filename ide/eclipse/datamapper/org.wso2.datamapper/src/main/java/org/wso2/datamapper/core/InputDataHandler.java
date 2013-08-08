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

package org.wso2.datamapper.core;

import java.io.File;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.wso2.datamapper.inputAdapters.InputDataReaderAdapter;
import org.wso2.datamapper.inputAdapters.XmlInputReader;

public class InputDataHandler {
	
	private File inputFile;
	private String inputFileType;
	private InputDataReaderAdapter inputAdapter;
	private List<OMElement> inputValueList;
	
	
	public InputDataHandler(String inputFileType){
		this.inputFileType = inputFileType;
		
		if(this.inputFileType.equals("xml")){
			inputAdapter = new XmlInputReader();
		}
	}
	
	public void setInputFile(File inputFile) {
		this.inputFile = inputFile;
	}

	public List<OMElement> getInputvalues(String element) {
		String elementValue;
		
		inputAdapter = new XmlInputReader();
		inputAdapter.setInputReader(inputFile);
		this.inputValueList = inputAdapter.readInputvalues(element);
		
		return this.inputValueList;
	}
}