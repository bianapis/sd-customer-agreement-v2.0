package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRegulatoryTermsUpdateInputModelCustomerAgreementInstanceRecord;
import org.bian.dto.BQRegulatoryTermsUpdateInputModelRegulatoryTermsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsUpdateOutputModel
 */
public class BQRegulatoryTermsUpdateOutputModel   {
  private BQRegulatoryTermsUpdateInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord = null;

  private BQRegulatoryTermsUpdateInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord = null;

  private String regulatoryTermsUpdateActionTaskReference = null;

  private Object regulatoryTermsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return regulatoryTermsUpdateActionTaskReference
  **/

  public String getRegulatoryTermsUpdateActionTaskReference() {
    return regulatoryTermsUpdateActionTaskReference;
  }

  public void setRegulatoryTermsUpdateActionTaskReference(String regulatoryTermsUpdateActionTaskReference) {
    this.regulatoryTermsUpdateActionTaskReference = regulatoryTermsUpdateActionTaskReference;
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

