package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAgreementRetrieveInputModelCustomerAgreementInstanceAnalysis;
import org.bian.dto.CRCustomerAgreementRetrieveInputModelCustomerAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementRetrieveInputModel
 */
public class CRCustomerAgreementRetrieveInputModel   {
  private Object customerAgreementRetrieveActionTaskRecord = null;

  private String customerAgreementRetrieveActionRequest = null;

  private CRCustomerAgreementRetrieveInputModelCustomerAgreementInstanceReportRecord customerAgreementInstanceReportRecord = null;

  private CRCustomerAgreementRetrieveInputModelCustomerAgreementInstanceAnalysis customerAgreementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerAgreementRetrieveActionTaskRecord
  **/

  public Object getCustomerAgreementRetrieveActionTaskRecord() {
    return customerAgreementRetrieveActionTaskRecord;
  }

  public void setCustomerAgreementRetrieveActionTaskRecord(Object customerAgreementRetrieveActionTaskRecord) {
    this.customerAgreementRetrieveActionTaskRecord = customerAgreementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerAgreementRetrieveActionRequest
  **/

  public String getCustomerAgreementRetrieveActionRequest() {
    return customerAgreementRetrieveActionRequest;
  }

  public void setCustomerAgreementRetrieveActionRequest(String customerAgreementRetrieveActionRequest) {
    this.customerAgreementRetrieveActionRequest = customerAgreementRetrieveActionRequest;
  }


  /**
   * Get customerAgreementInstanceReportRecord
   * @return customerAgreementInstanceReportRecord
  **/

  public CRCustomerAgreementRetrieveInputModelCustomerAgreementInstanceReportRecord getCustomerAgreementInstanceReportRecord() {
    return customerAgreementInstanceReportRecord;
  }

  public void setCustomerAgreementInstanceReportRecord(CRCustomerAgreementRetrieveInputModelCustomerAgreementInstanceReportRecord customerAgreementInstanceReportRecord) {
    this.customerAgreementInstanceReportRecord = customerAgreementInstanceReportRecord;
  }


  /**
   * Get customerAgreementInstanceAnalysis
   * @return customerAgreementInstanceAnalysis
  **/

  public CRCustomerAgreementRetrieveInputModelCustomerAgreementInstanceAnalysis getCustomerAgreementInstanceAnalysis() {
    return customerAgreementInstanceAnalysis;
  }

  public void setCustomerAgreementInstanceAnalysis(CRCustomerAgreementRetrieveInputModelCustomerAgreementInstanceAnalysis customerAgreementInstanceAnalysis) {
    this.customerAgreementInstanceAnalysis = customerAgreementInstanceAnalysis;
  }


}

