package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementControlOutputModel
 */
public class CRCustomerAgreementControlOutputModel   {
  private String customerAgreementControlActionTaskReference = null;

  private Object customerAgreementControlActionTaskRecord = null;

  private String customerAgreementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Agreement instance control processing service call 
   * @return customerAgreementControlActionTaskReference
  **/

  public String getCustomerAgreementControlActionTaskReference() {
    return customerAgreementControlActionTaskReference;
  }

  public void setCustomerAgreementControlActionTaskReference(String customerAgreementControlActionTaskReference) {
    this.customerAgreementControlActionTaskReference = customerAgreementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerAgreementControlActionTaskRecord
  **/

  public Object getCustomerAgreementControlActionTaskRecord() {
    return customerAgreementControlActionTaskRecord;
  }

  public void setCustomerAgreementControlActionTaskRecord(Object customerAgreementControlActionTaskRecord) {
    this.customerAgreementControlActionTaskRecord = customerAgreementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerAgreementControlActionResponse
  **/

  public String getCustomerAgreementControlActionResponse() {
    return customerAgreementControlActionResponse;
  }

  public void setCustomerAgreementControlActionResponse(String customerAgreementControlActionResponse) {
    this.customerAgreementControlActionResponse = customerAgreementControlActionResponse;
  }


}

