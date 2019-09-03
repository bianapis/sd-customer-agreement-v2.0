package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceAnalysis
 */
public class BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceAnalysis   {
  private Object policyTermsInstanceAnalysisRecord = null;

  private String policyTermsInstanceAnalysisReportType = null;

  private String policyTermsInstanceAnalysisParameters = null;

  private Object policyTermsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return policyTermsInstanceAnalysisRecord
  **/

  public Object getPolicyTermsInstanceAnalysisRecord() {
    return policyTermsInstanceAnalysisRecord;
  }

  public void setPolicyTermsInstanceAnalysisRecord(Object policyTermsInstanceAnalysisRecord) {
    this.policyTermsInstanceAnalysisRecord = policyTermsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return policyTermsInstanceAnalysisReportType
  **/

  public String getPolicyTermsInstanceAnalysisReportType() {
    return policyTermsInstanceAnalysisReportType;
  }

  public void setPolicyTermsInstanceAnalysisReportType(String policyTermsInstanceAnalysisReportType) {
    this.policyTermsInstanceAnalysisReportType = policyTermsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return policyTermsInstanceAnalysisParameters
  **/

  public String getPolicyTermsInstanceAnalysisParameters() {
    return policyTermsInstanceAnalysisParameters;
  }

  public void setPolicyTermsInstanceAnalysisParameters(String policyTermsInstanceAnalysisParameters) {
    this.policyTermsInstanceAnalysisParameters = policyTermsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return policyTermsInstanceAnalysisReport
  **/

  public Object getPolicyTermsInstanceAnalysisReport() {
    return policyTermsInstanceAnalysisReport;
  }

  public void setPolicyTermsInstanceAnalysisReport(Object policyTermsInstanceAnalysisReport) {
    this.policyTermsInstanceAnalysisReport = policyTermsInstanceAnalysisReport;
  }


}

