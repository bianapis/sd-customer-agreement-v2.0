package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAgreementControlInputModelCustomerAgreementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementControlInputModel
 */
public class CRCustomerAgreementControlInputModel   {
  private String customerAgreementServicingSessionReference = null;

  private String customerAgreementInstanceReference = null;

  private Object customerAgreementControlActionTaskRecord = null;

  private CRCustomerAgreementControlInputModelCustomerAgreementControlActionRequest customerAgreementControlActionRequest = null;


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
   * Get customerAgreementControlActionRequest
   * @return customerAgreementControlActionRequest
  **/

  public CRCustomerAgreementControlInputModelCustomerAgreementControlActionRequest getCustomerAgreementControlActionRequest() {
    return customerAgreementControlActionRequest;
  }

  public void setCustomerAgreementControlActionRequest(CRCustomerAgreementControlInputModelCustomerAgreementControlActionRequest customerAgreementControlActionRequest) {
    this.customerAgreementControlActionRequest = customerAgreementControlActionRequest;
  }


}

