package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAgreementRequestInputModelCustomerAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementRequestOutputModel
 */
public class CRCustomerAgreementRequestOutputModel   {
  private CRCustomerAgreementRequestInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord = null;

  private String customerAgreementRequestActionTaskReference = null;

  private Object customerAgreementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Agreement instance request service call 
   * @return customerAgreementRequestActionTaskReference
  **/

  public String getCustomerAgreementRequestActionTaskReference() {
    return customerAgreementRequestActionTaskReference;
  }

  public void setCustomerAgreementRequestActionTaskReference(String customerAgreementRequestActionTaskReference) {
    this.customerAgreementRequestActionTaskReference = customerAgreementRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

