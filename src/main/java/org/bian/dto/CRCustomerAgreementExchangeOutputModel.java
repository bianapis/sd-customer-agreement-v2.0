package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementExchangeOutputModel
 */
public class CRCustomerAgreementExchangeOutputModel   {
  private String customerAgreementExchangeActionTaskReference = null;

  private Object customerAgreementExchangeActionTaskRecord = null;

  private String customerAgreementExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Agreement instance exchange service call 
   * @return customerAgreementExchangeActionTaskReference
  **/

  public String getCustomerAgreementExchangeActionTaskReference() {
    return customerAgreementExchangeActionTaskReference;
  }

  public void setCustomerAgreementExchangeActionTaskReference(String customerAgreementExchangeActionTaskReference) {
    this.customerAgreementExchangeActionTaskReference = customerAgreementExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerAgreementExchangeActionResponse
  **/

  public String getCustomerAgreementExchangeActionResponse() {
    return customerAgreementExchangeActionResponse;
  }

  public void setCustomerAgreementExchangeActionResponse(String customerAgreementExchangeActionResponse) {
    this.customerAgreementExchangeActionResponse = customerAgreementExchangeActionResponse;
  }


}

