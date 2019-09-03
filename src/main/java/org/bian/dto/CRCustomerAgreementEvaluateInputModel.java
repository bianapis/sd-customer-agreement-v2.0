package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAgreementEvaluateInputModelCustomerAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementEvaluateInputModel
 */
public class CRCustomerAgreementEvaluateInputModel   {
  private String customerAgreementServicingSessionReference = null;

  private CRCustomerAgreementEvaluateInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord = null;


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
   * Get customerAgreementInstanceRecord
   * @return customerAgreementInstanceRecord
  **/

  public CRCustomerAgreementEvaluateInputModelCustomerAgreementInstanceRecord getCustomerAgreementInstanceRecord() {
    return customerAgreementInstanceRecord;
  }

  public void setCustomerAgreementInstanceRecord(CRCustomerAgreementEvaluateInputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord) {
    this.customerAgreementInstanceRecord = customerAgreementInstanceRecord;
  }


}

