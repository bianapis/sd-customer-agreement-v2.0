package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAgreementUpdateInputModelCustomerAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementUpdateOutputModel
 */
public class CRCustomerAgreementUpdateOutputModel   {
  private CRCustomerAgreementUpdateInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord = null;

  private String customerAgreementUpdateActionTaskReference = null;

  private Object customerAgreementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerAgreementUpdateActionTaskReference
  **/

  public String getCustomerAgreementUpdateActionTaskReference() {
    return customerAgreementUpdateActionTaskReference;
  }

  public void setCustomerAgreementUpdateActionTaskReference(String customerAgreementUpdateActionTaskReference) {
    this.customerAgreementUpdateActionTaskReference = customerAgreementUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

