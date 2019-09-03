package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceAnalysis
 */
public class BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceAnalysis   {
  private Object regulatoryTermsInstanceAnalysisRecord = null;

  private String regulatoryTermsInstanceAnalysisReportType = null;

  private String regulatoryTermsInstanceAnalysisParameters = null;

  private Object regulatoryTermsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return regulatoryTermsInstanceAnalysisRecord
  **/

  public Object getRegulatoryTermsInstanceAnalysisRecord() {
    return regulatoryTermsInstanceAnalysisRecord;
  }

  public void setRegulatoryTermsInstanceAnalysisRecord(Object regulatoryTermsInstanceAnalysisRecord) {
    this.regulatoryTermsInstanceAnalysisRecord = regulatoryTermsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return regulatoryTermsInstanceAnalysisReportType
  **/

  public String getRegulatoryTermsInstanceAnalysisReportType() {
    return regulatoryTermsInstanceAnalysisReportType;
  }

  public void setRegulatoryTermsInstanceAnalysisReportType(String regulatoryTermsInstanceAnalysisReportType) {
    this.regulatoryTermsInstanceAnalysisReportType = regulatoryTermsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return regulatoryTermsInstanceAnalysisParameters
  **/

  public String getRegulatoryTermsInstanceAnalysisParameters() {
    return regulatoryTermsInstanceAnalysisParameters;
  }

  public void setRegulatoryTermsInstanceAnalysisParameters(String regulatoryTermsInstanceAnalysisParameters) {
    this.regulatoryTermsInstanceAnalysisParameters = regulatoryTermsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return regulatoryTermsInstanceAnalysisReport
  **/

  public Object getRegulatoryTermsInstanceAnalysisReport() {
    return regulatoryTermsInstanceAnalysisReport;
  }

  public void setRegulatoryTermsInstanceAnalysisReport(Object regulatoryTermsInstanceAnalysisReport) {
    this.regulatoryTermsInstanceAnalysisReport = regulatoryTermsInstanceAnalysisReport;
  }


}

