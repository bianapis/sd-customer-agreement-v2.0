package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceAnalysis;
import org.bian.dto.CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceRecord;
import org.bian.dto.CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementRetrieveOutputModel
 */
public class CRCustomerAgreementRetrieveOutputModel   {
  private CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord = null;

  private String customerAgreementRetrieveActionTaskReference = null;

  private Object customerAgreementRetrieveActionTaskRecord = null;

  private String customerAgreementRetrieveActionResponse = null;

  private CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceReportRecord customerAgreementInstanceReportRecord = null;

  private CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceAnalysis customerAgreementInstanceAnalysis = null;


  /**
   * Get customerAgreementInstanceRecord
   * @return customerAgreementInstanceRecord
  **/

  public CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceRecord getCustomerAgreementInstanceRecord() {
    return customerAgreementInstanceRecord;
  }

  public void setCustomerAgreementInstanceRecord(CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord) {
    this.customerAgreementInstanceRecord = customerAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Agreement instance retrieve service call 
   * @return customerAgreementRetrieveActionTaskReference
  **/

  public String getCustomerAgreementRetrieveActionTaskReference() {
    return customerAgreementRetrieveActionTaskReference;
  }

  public void setCustomerAgreementRetrieveActionTaskReference(String customerAgreementRetrieveActionTaskReference) {
    this.customerAgreementRetrieveActionTaskReference = customerAgreementRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerAgreementRetrieveActionResponse
  **/

  public String getCustomerAgreementRetrieveActionResponse() {
    return customerAgreementRetrieveActionResponse;
  }

  public void setCustomerAgreementRetrieveActionResponse(String customerAgreementRetrieveActionResponse) {
    this.customerAgreementRetrieveActionResponse = customerAgreementRetrieveActionResponse;
  }


  /**
   * Get customerAgreementInstanceReportRecord
   * @return customerAgreementInstanceReportRecord
  **/

  public CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceReportRecord getCustomerAgreementInstanceReportRecord() {
    return customerAgreementInstanceReportRecord;
  }

  public void setCustomerAgreementInstanceReportRecord(CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceReportRecord customerAgreementInstanceReportRecord) {
    this.customerAgreementInstanceReportRecord = customerAgreementInstanceReportRecord;
  }


  /**
   * Get customerAgreementInstanceAnalysis
   * @return customerAgreementInstanceAnalysis
  **/

  public CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceAnalysis getCustomerAgreementInstanceAnalysis() {
    return customerAgreementInstanceAnalysis;
  }

  public void setCustomerAgreementInstanceAnalysis(CRCustomerAgreementRetrieveOutputModelCustomerAgreementInstanceAnalysis customerAgreementInstanceAnalysis) {
    this.customerAgreementInstanceAnalysis = customerAgreementInstanceAnalysis;
  }


}

