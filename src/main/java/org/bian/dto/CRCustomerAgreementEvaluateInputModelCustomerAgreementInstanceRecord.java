package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementEvaluateInputModelCustomerAgreementInstanceRecord
 */
public class CRCustomerAgreementEvaluateInputModelCustomerAgreementInstanceRecord   {
  private String customerReference = null;

  private String legalEntityReference = null;

  private String agreementType = null;

  private String agreementValidFromToDate = null;

  private String agreementSignatoriesResponsibleParties = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String salesProductAgreementReference = null;

  private String partyLifecycleManagementReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer (can currently be a person or a company) 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the legal entity that is the subject of the agreement 
   * @return legalEntityReference
  **/

  public String getLegalEntityReference() {
    return legalEntityReference;
  }

  public void setLegalEntityReference(String legalEntityReference) {
    this.legalEntityReference = legalEntityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of customer agreement (e.g. individual, corporate) 
   * @return agreementType
  **/

  public String getAgreementType() {
    return agreementType;
  }

  public void setAgreementType(String agreementType) {
    this.agreementType = agreementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The term of the agreement 
   * @return agreementValidFromToDate
  **/

  public String getAgreementValidFromToDate() {
    return agreementValidFromToDate;
  }

  public void setAgreementValidFromToDate(String agreementValidFromToDate) {
    this.agreementValidFromToDate = agreementValidFromToDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to signatories 
   * @return agreementSignatoriesResponsibleParties
  **/

  public String getAgreementSignatoriesResponsibleParties() {
    return agreementSignatoriesResponsibleParties;
  }

  public void setAgreementSignatoriesResponsibleParties(String agreementSignatoriesResponsibleParties) {
    this.agreementSignatoriesResponsibleParties = agreementSignatoriesResponsibleParties;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to product specific T&Cs maintained elsewhere but subordinate to this agreement 
   * @return salesProductAgreementReference
  **/

  public String getSalesProductAgreementReference() {
    return salesProductAgreementReference;
  }

  public void setSalesProductAgreementReference(String salesProductAgreementReference) {
    this.salesProductAgreementReference = salesProductAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to KYC/Regulatory assessments maintained elsewhere for the customer 
   * @return partyLifecycleManagementReference
  **/

  public String getPartyLifecycleManagementReference() {
    return partyLifecycleManagementReference;
  }

  public void setPartyLifecycleManagementReference(String partyLifecycleManagementReference) {
    this.partyLifecycleManagementReference = partyLifecycleManagementReference;
  }


}

