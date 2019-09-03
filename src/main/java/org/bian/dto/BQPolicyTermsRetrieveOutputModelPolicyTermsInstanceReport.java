package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceReport
 */
public class BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceReport   {
  private Object policyTermsInstanceReportRecord = null;

  private String policyTermsInstanceReportType = null;

  private String policyTermsInstanceReportParameters = null;

  private Object policyTermsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return policyTermsInstanceReportRecord
  **/

  public Object getPolicyTermsInstanceReportRecord() {
    return policyTermsInstanceReportRecord;
  }

  public void setPolicyTermsInstanceReportRecord(Object policyTermsInstanceReportRecord) {
    this.policyTermsInstanceReportRecord = policyTermsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return policyTermsInstanceReportType
  **/

  public String getPolicyTermsInstanceReportType() {
    return policyTermsInstanceReportType;
  }

  public void setPolicyTermsInstanceReportType(String policyTermsInstanceReportType) {
    this.policyTermsInstanceReportType = policyTermsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return policyTermsInstanceReportParameters
  **/

  public String getPolicyTermsInstanceReportParameters() {
    return policyTermsInstanceReportParameters;
  }

  public void setPolicyTermsInstanceReportParameters(String policyTermsInstanceReportParameters) {
    this.policyTermsInstanceReportParameters = policyTermsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return policyTermsInstanceReport
  **/

  public Object getPolicyTermsInstanceReport() {
    return policyTermsInstanceReport;
  }

  public void setPolicyTermsInstanceReport(Object policyTermsInstanceReport) {
    this.policyTermsInstanceReport = policyTermsInstanceReport;
  }


}

