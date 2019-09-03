package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementRetrieveInputModelCustomerAgreementInstanceReportRecord
 */
public class CRCustomerAgreementRetrieveInputModelCustomerAgreementInstanceReportRecord   {
  private String customerAgreementInstanceReportReference = null;

  private String customerAgreementInstanceReportType = null;

  private String customerAgreementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerAgreementInstanceReportReference
  **/

  public String getCustomerAgreementInstanceReportReference() {
    return customerAgreementInstanceReportReference;
  }

  public void setCustomerAgreementInstanceReportReference(String customerAgreementInstanceReportReference) {
    this.customerAgreementInstanceReportReference = customerAgreementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerAgreementInstanceReportType
  **/

  public String getCustomerAgreementInstanceReportType() {
    return customerAgreementInstanceReportType;
  }

  public void setCustomerAgreementInstanceReportType(String customerAgreementInstanceReportType) {
    this.customerAgreementInstanceReportType = customerAgreementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerAgreementInstanceReportParameters
  **/

  public String getCustomerAgreementInstanceReportParameters() {
    return customerAgreementInstanceReportParameters;
  }

  public void setCustomerAgreementInstanceReportParameters(String customerAgreementInstanceReportParameters) {
    this.customerAgreementInstanceReportParameters = customerAgreementInstanceReportParameters;
  }


}

