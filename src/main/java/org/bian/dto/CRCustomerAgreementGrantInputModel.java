package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerAgreementGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementGrantInputModel
 */
public class CRCustomerAgreementGrantInputModel   {
  private String customerAgreementServicingSessionReference = null;

  private String customerAgreementInstanceReference = null;

  private Object customerAgreementGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRCustomerAgreementGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRCustomerAgreementGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRCustomerAgreementGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

