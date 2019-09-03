package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAgreementRequestInputModelCustomerAgreementInstanceRecord;
import org.bian.dto.CRCustomerAgreementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementRequestInputModel
 */
public class CRCustomerAgreementRequestInputModel   {
  private String customerAgreementServicingSessionReference = null;

  private String customerAgreementInstanceReference = null;

  private CRCustomerAgreementRequestInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord = null;

  private Object customerAgreementRequestActionTaskRecord = null;

  private CRCustomerAgreementRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCustomerAgreementRequestInputModelCustomerAgreementInstanceRecord getCustomerAgreementInstanceRecord() {
    return customerAgreementInstanceRecord;
  }

  public void setCustomerAgreementInstanceRecord(CRCustomerAgreementRequestInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord) {
    this.customerAgreementInstanceRecord = customerAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerAgreementRequestActionTaskRecord
  **/

  public Object getCustomerAgreementRequestActionTaskRecord() {
    return customerAgreementRequestActionTaskRecord;
  }

  public void setCustomerAgreementRequestActionTaskRecord(Object customerAgreementRequestActionTaskRecord) {
    this.customerAgreementRequestActionTaskRecord = customerAgreementRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerAgreementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerAgreementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

