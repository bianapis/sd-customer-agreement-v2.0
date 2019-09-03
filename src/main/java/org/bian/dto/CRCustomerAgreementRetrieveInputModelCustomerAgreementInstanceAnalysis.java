package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementRetrieveInputModelCustomerAgreementInstanceAnalysis
 */
public class CRCustomerAgreementRetrieveInputModelCustomerAgreementInstanceAnalysis   {
  private String customerAgreementInstanceAnalysisReference = null;

  private String customerAgreementInstanceAnalysisReportType = null;

  private String customerAgreementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerAgreementInstanceAnalysisReference
  **/

  public String getCustomerAgreementInstanceAnalysisReference() {
    return customerAgreementInstanceAnalysisReference;
  }

  public void setCustomerAgreementInstanceAnalysisReference(String customerAgreementInstanceAnalysisReference) {
    this.customerAgreementInstanceAnalysisReference = customerAgreementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerAgreementInstanceAnalysisParameters
  **/

  public String getCustomerAgreementInstanceAnalysisParameters() {
    return customerAgreementInstanceAnalysisParameters;
  }

  public void setCustomerAgreementInstanceAnalysisParameters(String customerAgreementInstanceAnalysisParameters) {
    this.customerAgreementInstanceAnalysisParameters = customerAgreementInstanceAnalysisParameters;
  }


}

