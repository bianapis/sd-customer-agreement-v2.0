package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceAnalysis
 */
public class CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceAnalysis   {
  private String customerAgreementInstanceAnalysisData = null;

  private String customerAgreementInstanceAnalysisReportType = null;

  private Object customerAgreementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerAgreementInstanceAnalysisData
  **/

  public String getCustomerAgreementInstanceAnalysisData() {
    return customerAgreementInstanceAnalysisData;
  }

  public void setCustomerAgreementInstanceAnalysisData(String customerAgreementInstanceAnalysisData) {
    this.customerAgreementInstanceAnalysisData = customerAgreementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerAgreementInstanceAnalysisReportType
  **/

  public String getCustomerAgreementInstanceAnalysisReportType() {
    return customerAgreementInstanceAnalysisReportType;
  }

  public void setCustomerAgreementInstanceAnalysisReportType(String customerAgreementInstanceAnalysisReportType) {
    this.customerAgreementInstanceAnalysisReportType = customerAgreementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerAgreementInstanceAnalysisReport
  **/

  public Object getCustomerAgreementInstanceAnalysisReport() {
    return customerAgreementInstanceAnalysisReport;
  }

  public void setCustomerAgreementInstanceAnalysisReport(Object customerAgreementInstanceAnalysisReport) {
    this.customerAgreementInstanceAnalysisReport = customerAgreementInstanceAnalysisReport;
  }


}

