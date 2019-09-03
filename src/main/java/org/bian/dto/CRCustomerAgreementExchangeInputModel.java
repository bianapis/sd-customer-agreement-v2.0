package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAgreementExchangeInputModelCustomerAgreementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementExchangeInputModel
 */
public class CRCustomerAgreementExchangeInputModel   {
  private String customerAgreementServicingSessionReference = null;

  private String customerAgreementInstanceReference = null;

  private Object customerAgreementExchangeActionTaskRecord = null;

  private CRCustomerAgreementExchangeInputModelCustomerAgreementExchangeActionRequest customerAgreementExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerAgreementServicingSessionReference
  **/

  public String getCustomerAgreementServicingSessionReference() {
    return customerAgreementServicingSessionReference;
  }

  public void setCustomerAgreementServicingSessionReference(String customerAgreementServicingSessionReference) {
    this.customerAgreementServicingSessionReference = customerAgreementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Agreement instance 
   * @return customerAgreementInstanceReference
  **/

  public String getCustomerAgreementInstanceReference() {
    return customerAgreementInstanceReference;
  }

  public void setCustomerAgreementInstanceReference(String customerAgreementInstanceReference) {
    this.customerAgreementInstanceReference = customerAgreementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerAgreementExchangeActionTaskRecord
  **/

  public Object getCustomerAgreementExchangeActionTaskRecord() {
    return customerAgreementExchangeActionTaskRecord;
  }

  public void setCustomerAgreementExchangeActionTaskRecord(Object customerAgreementExchangeActionTaskRecord) {
    this.customerAgreementExchangeActionTaskRecord = customerAgreementExchangeActionTaskRecord;
  }


  /**
   * Get customerAgreementExchangeActionRequest
   * @return customerAgreementExchangeActionRequest
  **/

  public CRCustomerAgreementExchangeInputModelCustomerAgreementExchangeActionRequest getCustomerAgreementExchangeActionRequest() {
    return customerAgreementExchangeActionRequest;
  }

  public void setCustomerAgreementExchangeActionRequest(CRCustomerAgreementExchangeInputModelCustomerAgreementExchangeActionRequest customerAgreementExchangeActionRequest) {
    this.customerAgreementExchangeActionRequest = customerAgreementExchangeActionRequest;
  }


}

