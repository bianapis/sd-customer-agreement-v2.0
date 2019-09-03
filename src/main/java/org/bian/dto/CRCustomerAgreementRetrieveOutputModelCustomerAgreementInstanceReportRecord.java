package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceReportRecord
 */
public class CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceReportRecord   {
  private String customerAgreementInstanceReportData = null;

  private String customerAgreementInstanceReportType = null;

  private Object customerAgreementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerAgreementInstanceReportData
  **/

  public String getCustomerAgreementInstanceReportData() {
    return customerAgreementInstanceReportData;
  }

  public void setCustomerAgreementInstanceReportData(String customerAgreementInstanceReportData) {
    this.customerAgreementInstanceReportData = customerAgreementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerAgreementInstanceReport
  **/

  public Object getCustomerAgreementInstanceReport() {
    return customerAgreementInstanceReport;
  }

  public void setCustomerAgreementInstanceReport(Object customerAgreementInstanceReport) {
    this.customerAgreementInstanceReport = customerAgreementInstanceReport;
  }


}

