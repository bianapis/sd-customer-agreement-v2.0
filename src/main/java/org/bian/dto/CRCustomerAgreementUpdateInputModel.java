package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAgreementUpdateInputModelCustomerAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementUpdateInputModel
 */
public class CRCustomerAgreementUpdateInputModel   {
  private String customerAgreementServicingSessionReference = null;

  private String customerAgreementInstanceReference = null;

  private CRCustomerAgreementUpdateInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord = null;

  private Object customerAgreementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get customerAgreementInstanceRecord
   * @return customerAgreementInstanceRecord
  **/

  public CRCustomerAgreementUpdateInputModelCustomerAgreementInstanceRecord getCustomerAgreementInstanceRecord() {
    return customerAgreementInstanceRecord;
  }

  public void setCustomerAgreementInstanceRecord(CRCustomerAgreementUpdateInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord) {
    this.customerAgreementInstanceRecord = customerAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerAgreementUpdateActionTaskRecord
  **/

  public Object getCustomerAgreementUpdateActionTaskRecord() {
    return customerAgreementUpdateActionTaskRecord;
  }

  public void setCustomerAgreementUpdateActionTaskRecord(Object customerAgreementUpdateActionTaskRecord) {
    this.customerAgreementUpdateActionTaskRecord = customerAgreementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

