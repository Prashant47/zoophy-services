package edu.asu.zoophy.rest;

import java.util.List;
import java.util.Map;

import edu.asu.zoophy.rest.custom.FlatJobRecord;
import edu.asu.zoophy.rest.pipeline.XMLParameters;
import edu.asu.zoophy.rest.pipeline.glm.Predictor;

/**
 * Parameters for ZooPhy jobs
 * @author devdemetri
 */
public class CustomJobParameters {
	
	private String replyEmail;
	private String jobName;
	private List<FlatJobRecord> records;
	private boolean useGLM = false;
	private Map<String, List<Predictor>> predictors = null;
	private XMLParameters xmlOptions = XMLParameters.getDefault();
	
	public CustomJobParameters() {
		
	}

	public String getReplyEmail() {
		return replyEmail;
	}

	public void setReplyEmail(String replyEmail) {
		this.replyEmail = replyEmail;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public List<FlatJobRecord> getRecords() {
		return records;
	}

	public void setRecords(List<FlatJobRecord> records) {
		this.records = records;
	}

	public boolean isUsingGLM() {
		return useGLM;
	}

	public void setUseGLM(boolean useGLM) {
		this.useGLM = useGLM;
	}

	public Map<String, List<Predictor>> getPredictors() {
		return predictors;
	}

	public void setPredictors(Map<String, List<Predictor>> predictors) {
		this.predictors = predictors;
	}

	public XMLParameters getXmlOptions() {
		return xmlOptions;
	}

	public void setXmlOptions(XMLParameters xmlOptions) {
		this.xmlOptions = xmlOptions;
	}
	
}