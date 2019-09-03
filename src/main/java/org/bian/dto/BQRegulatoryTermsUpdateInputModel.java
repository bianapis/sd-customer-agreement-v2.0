package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRegulatoryTermsUpdateInputModelCustomerAgreementInstanceRecord;
import org.bian.dto.BQRegulatoryTermsUpdateInputModelRegulatoryTermsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsUpdateInputModel
 */
public class BQRegulatoryTermsUpdateInputModel   {
  private BQRegulatoryTermsUpdateInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord = null;

  private String customerAgreementInstanceReference = null;

  private String regulatoryTermsInstanceReference = null;

  private BQRegulatoryTermsUpdateInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord = null;

  private Object regulatoryTermsUpdateActionTaskRecord = null;

  private String regulatoryTermsUpdateActionRequest = null;


  /**
   * Get customerAgreementInstanceRecord
   * @return customerAgreementInstanceRecord
  **/

  public BQRegulatoryTermsUpdateInputModelCustomerAgreementInstanceRecord getCustomerAgreementInstanceRecord() {
    return customerAgreementInstanceRecord;
  }

  public void setCustomerAgreementInstanceRecord(BQRegulatoryTermsUpdateInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord) {
    this.customerAgreementInstanceRecord = customerAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Agreement instance 
   * @return customerAgreementInstanceReference
  **/

  public String getCustomerAgreementInstanceReference() {
    return customerAgreementInstanceReference;
  }

  public void setCustomerAgreementInstanceReference(String customerAgreementInstanceReference) {
    this.customerAgreementInstanceReference = customerAgreementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Regulatory Terms instance 
   * @return regulatoryTermsInstanceReference
  **/

  public String getRegulatoryTermsInstanceReference() {
    return regulatoryTermsInstanceReference;
  }

  public void setRegulatoryTermsInstanceReference(String regulatoryTermsInstanceReference) {
    this.regulatoryTermsInstanceReference = regulatoryTermsInstanceReference;
  }


  /**
   * Get regulatoryTermsInstanceRecord
   * @return regulatoryTermsInstanceRecord
  **/

  public BQRegulatoryTermsUpdateInputModelRegulatoryTermsInstanceRecord getRegulatoryTermsInstanceRecord() {
    return regulatoryTermsInstanceRecord;
  }

  public void setRegulatoryTermsInstanceRecord(BQRegulatoryTermsUpdateInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord) {
    this.regulatoryTermsInstanceRecord = regulatoryTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return regulatoryTermsUpdateActionTaskRecord
  **/

  public Object getRegulatoryTermsUpdateActionTaskRecord() {
    return regulatoryTermsUpdateActionTaskRecord;
  }

  public void setRegulatoryTermsUpdateActionTaskRecord(Object regulatoryTermsUpdateActionTaskRecord) {
    this.regulatoryTermsUpdateActionTaskRecord = regulatoryTermsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return regulatoryTermsUpdateActionRequest
  **/

  public String getRegulatoryTermsUpdateActionRequest() {
    return regulatoryTermsUpdateActionRequest;
  }

  public void setRegulatoryTermsUpdateActionRequest(String regulatoryTermsUpdateActionRequest) {
    this.regulatoryTermsUpdateActionRequest = regulatoryTermsUpdateActionRequest;
  }


}

