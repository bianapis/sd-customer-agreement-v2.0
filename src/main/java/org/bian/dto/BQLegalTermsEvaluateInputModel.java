package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLegalTermsEvaluateInputModelCustomerAgreementInstanceRecord;
import org.bian.dto.BQLegalTermsEvaluateInputModelLegalTermsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLegalTermsEvaluateInputModel
 */
public class BQLegalTermsEvaluateInputModel   {
  private BQLegalTermsEvaluateInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord = null;

  private String customerAgreementInstanceReference = null;

  private String legalTermsInstanceReference = null;

  private BQLegalTermsEvaluateInputModelLegalTermsInstanceRecord legalTermsInstanceRecord = null;


  /**
   * Get customerAgreementInstanceRecord
   * @return customerAgreementInstanceRecord
  **/

  public BQLegalTermsEvaluateInputModelCustomerAgreementInstanceRecord getCustomerAgreementInstanceRecord() {
    return customerAgreementInstanceRecord;
  }

  public void setCustomerAgreementInstanceRecord(BQLegalTermsEvaluateInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Legal Terms instance 
   * @return legalTermsInstanceReference
  **/

  public String getLegalTermsInstanceReference() {
    return legalTermsInstanceReference;
  }

  public void setLegalTermsInstanceReference(String legalTermsInstanceReference) {
    this.legalTermsInstanceReference = legalTermsInstanceReference;
  }


  /**
   * Get legalTermsInstanceRecord
   * @return legalTermsInstanceRecord
  **/

  public BQLegalTermsEvaluateInputModelLegalTermsInstanceRecord getLegalTermsInstanceRecord() {
    return legalTermsInstanceRecord;
  }

  public void setLegalTermsInstanceRecord(BQLegalTermsEvaluateInputModelLegalTermsInstanceRecord legalTermsInstanceRecord) {
    this.legalTermsInstanceRecord = legalTermsInstanceRecord;
  }


}

