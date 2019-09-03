package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLegalTermsUpdateInputModelCustomerAgreementInstanceRecord;
import org.bian.dto.BQLegalTermsUpdateInputModelLegalTermsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLegalTermsUpdateOutputModel
 */
public class BQLegalTermsUpdateOutputModel   {
  private BQLegalTermsUpdateInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord = null;

  private BQLegalTermsUpdateInputModelLegalTermsInstanceRecord legalTermsInstanceRecord = null;

  private String legalTermsUpdateActionTaskReference = null;

  private Object legalTermsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerAgreementInstanceRecord
   * @return customerAgreementInstanceRecord
  **/

  public BQLegalTermsUpdateInputModelCustomerAgreementInstanceRecord getCustomerAgreementInstanceRecord() {
    return customerAgreementInstanceRecord;
  }

  public void setCustomerAgreementInstanceRecord(BQLegalTermsUpdateInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord) {
    this.customerAgreementInstanceRecord = customerAgreementInstanceRecord;
  }


  /**
   * Get legalTermsInstanceRecord
   * @return legalTermsInstanceRecord
  **/

  public BQLegalTermsUpdateInputModelLegalTermsInstanceRecord getLegalTermsInstanceRecord() {
    return legalTermsInstanceRecord;
  }

  public void setLegalTermsInstanceRecord(BQLegalTermsUpdateInputModelLegalTermsInstanceRecord legalTermsInstanceRecord) {
    this.legalTermsInstanceRecord = legalTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return legalTermsUpdateActionTaskReference
  **/

  public String getLegalTermsUpdateActionTaskReference() {
    return legalTermsUpdateActionTaskReference;
  }

  public void setLegalTermsUpdateActionTaskReference(String legalTermsUpdateActionTaskReference) {
    this.legalTermsUpdateActionTaskReference = legalTermsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return legalTermsUpdateActionTaskRecord
  **/

  public Object getLegalTermsUpdateActionTaskRecord() {
    return legalTermsUpdateActionTaskRecord;
  }

  public void setLegalTermsUpdateActionTaskRecord(Object legalTermsUpdateActionTaskRecord) {
    this.legalTermsUpdateActionTaskRecord = legalTermsUpdateActionTaskRecord;
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

