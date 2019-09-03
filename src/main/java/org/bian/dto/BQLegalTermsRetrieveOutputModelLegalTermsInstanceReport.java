package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLegalTermsRetrieveOutputModelLegalTermsInstanceReport
 */
public class BQLegalTermsRetrieveOutputModelLegalTermsInstanceReport   {
  private Object legalTermsInstanceReportRecord = null;

  private String legalTermsInstanceReportType = null;

  private String legalTermsInstanceReportParameters = null;

  private Object legalTermsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return legalTermsInstanceReportRecord
  **/

  public Object getLegalTermsInstanceReportRecord() {
    return legalTermsInstanceReportRecord;
  }

  public void setLegalTermsInstanceReportRecord(Object legalTermsInstanceReportRecord) {
    this.legalTermsInstanceReportRecord = legalTermsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return legalTermsInstanceReportType
  **/

  public String getLegalTermsInstanceReportType() {
    return legalTermsInstanceReportType;
  }

  public void setLegalTermsInstanceReportType(String legalTermsInstanceReportType) {
    this.legalTermsInstanceReportType = legalTermsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return legalTermsInstanceReportParameters
  **/

  public String getLegalTermsInstanceReportParameters() {
    return legalTermsInstanceReportParameters;
  }

  public void setLegalTermsInstanceReportParameters(String legalTermsInstanceReportParameters) {
    this.legalTermsInstanceReportParameters = legalTermsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return legalTermsInstanceReport
  **/

  public Object getLegalTermsInstanceReport() {
    return legalTermsInstanceReport;
  }

  public void setLegalTermsInstanceReport(Object legalTermsInstanceReport) {
    this.legalTermsInstanceReport = legalTermsInstanceReport;
  }


}

