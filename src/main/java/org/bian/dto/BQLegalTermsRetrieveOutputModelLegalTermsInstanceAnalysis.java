package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLegalTermsRetrieveOutputModelLegalTermsInstanceAnalysis
 */
public class BQLegalTermsRetrieveOutputModelLegalTermsInstanceAnalysis   {
  private Object legalTermsInstanceAnalysisRecord = null;

  private String legalTermsInstanceAnalysisReportType = null;

  private String legalTermsInstanceAnalysisParameters = null;

  private Object legalTermsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return legalTermsInstanceAnalysisRecord
  **/

  public Object getLegalTermsInstanceAnalysisRecord() {
    return legalTermsInstanceAnalysisRecord;
  }

  public void setLegalTermsInstanceAnalysisRecord(Object legalTermsInstanceAnalysisRecord) {
    this.legalTermsInstanceAnalysisRecord = legalTermsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return legalTermsInstanceAnalysisReportType
  **/

  public String getLegalTermsInstanceAnalysisReportType() {
    return legalTermsInstanceAnalysisReportType;
  }

  public void setLegalTermsInstanceAnalysisReportType(String legalTermsInstanceAnalysisReportType) {
    this.legalTermsInstanceAnalysisReportType = legalTermsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return legalTermsInstanceAnalysisParameters
  **/

  public String getLegalTermsInstanceAnalysisParameters() {
    return legalTermsInstanceAnalysisParameters;
  }

  public void setLegalTermsInstanceAnalysisParameters(String legalTermsInstanceAnalysisParameters) {
    this.legalTermsInstanceAnalysisParameters = legalTermsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return legalTermsInstanceAnalysisReport
  **/

  public Object getLegalTermsInstanceAnalysisReport() {
    return legalTermsInstanceAnalysisReport;
  }

  public void setLegalTermsInstanceAnalysisReport(Object legalTermsInstanceAnalysisReport) {
    this.legalTermsInstanceAnalysisReport = legalTermsInstanceAnalysisReport;
  }


}

