package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAgreementGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementGrantOutputModel
 */
public class CRCustomerAgreementGrantOutputModel   {
  private String customerAgreementGrantActionTaskReference = null;

  private Object customerAgreementGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRCustomerAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Agreement instance grant service call 
   * @return customerAgreementGrantActionTaskReference
  **/

  public String getCustomerAgreementGrantActionTaskReference() {
    return customerAgreementGrantActionTaskReference;
  }

  public void setCustomerAgreementGrantActionTaskReference(String customerAgreementGrantActionTaskReference) {
    this.customerAgreementGrantActionTaskReference = customerAgreementGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return customerAgreementGrantActionTaskRecord
  **/

  public Object getCustomerAgreementGrantActionTaskRecord() {
    return customerAgreementGrantActionTaskRecord;
  }

  public void setCustomerAgreementGrantActionTaskRecord(Object customerAgreementGrantActionTaskRecord) {
    this.customerAgreementGrantActionTaskRecord = customerAgreementGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRCustomerAgreementGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRCustomerAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

