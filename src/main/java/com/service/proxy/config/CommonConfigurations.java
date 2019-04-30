package com.service.proxy.config;

import java.util.Arrays;

public class CommonConfigurations {
	
	private String methodType;
	private String inputSchemaFile; 
    private String outputSchemaFile;
	private Boolean inputValidationRequired;
    private Boolean outputValidationRequired;
    private String requiredHeaders[];
    
	@Override
	public String toString() {
		return "          CommonConfigurations [methodType=" + methodType + ", inputSchemaFile=" + inputSchemaFile
				+ ", outputSchemaFile=" + outputSchemaFile + ", inputValidationRequired=" + inputValidationRequired
				+ ", outputValidationRequired=" + outputValidationRequired + ", requiredHeaders="
				+ Arrays.toString(requiredHeaders) + "]";
	}
	public String getMethodType() {
		return methodType;
	}
	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}
	public String getInputSchemaFile() {
		return inputSchemaFile;
	}
	public void setInputSchemaFile(String inputSchemaFile) {
		this.inputSchemaFile = inputSchemaFile;
	}
	public String getOutputSchemaFile() {
		return outputSchemaFile;
	}
	public void setOutputSchemaFile(String outputSchemaFile) {
		this.outputSchemaFile = outputSchemaFile;
	}
	public Boolean getInputValidationRequired() {
		return inputValidationRequired;
	}
	public void setInputValidationRequired(Boolean inputValidationRequired) {
		this.inputValidationRequired = inputValidationRequired;
	}
	public Boolean getOutputValidationRequired() {
		return outputValidationRequired;
	}
	public void setOutputValidationRequired(Boolean outputValidationRequired) {
		this.outputValidationRequired = outputValidationRequired;
	}
	public String[] getRequiredHeaders() {
		return requiredHeaders;
	}
	public void setRequiredHeaders(String[] requiredHeaders) {
		this.requiredHeaders = requiredHeaders;
	}
    
    
}
