package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceReport
 */
public class BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceReport   {
  private Object regulatoryTermsInstanceReportRecord = null;

  private String regulatoryTermsInstanceReportType = null;

  private String regulatoryTermsInstanceReportParameters = null;

  private Object regulatoryTermsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return regulatoryTermsInstanceReportRecord
  **/

  public Object getRegulatoryTermsInstanceReportRecord() {
    return regulatoryTermsInstanceReportRecord;
  }

  public void setRegulatoryTermsInstanceReportRecord(Object regulatoryTermsInstanceReportRecord) {
    this.regulatoryTermsInstanceReportRecord = regulatoryTermsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return regulatoryTermsInstanceReportType
  **/

  public String getRegulatoryTermsInstanceReportType() {
    return regulatoryTermsInstanceReportType;
  }

  public void setRegulatoryTermsInstanceReportType(String regulatoryTermsInstanceReportType) {
    this.regulatoryTermsInstanceReportType = regulatoryTermsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return regulatoryTermsInstanceReportParameters
  **/

  public String getRegulatoryTermsInstanceReportParameters() {
    return regulatoryTermsInstanceReportParameters;
  }

  public void setRegulatoryTermsInstanceReportParameters(String regulatoryTermsInstanceReportParameters) {
    this.regulatoryTermsInstanceReportParameters = regulatoryTermsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return regulatoryTermsInstanceReport
  **/

  public Object getRegulatoryTermsInstanceReport() {
    return regulatoryTermsInstanceReport;
  }

  public void setRegulatoryTermsInstanceReport(Object regulatoryTermsInstanceReport) {
    this.regulatoryTermsInstanceReport = regulatoryTermsInstanceReport;
  }


}

