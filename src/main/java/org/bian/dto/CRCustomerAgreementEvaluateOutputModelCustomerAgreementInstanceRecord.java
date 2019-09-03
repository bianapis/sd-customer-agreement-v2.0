package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementEvaluateOutputModelCustomerAgreementInstanceRecord
 */
public class CRCustomerAgreementEvaluateOutputModelCustomerAgreementInstanceRecord   {
  private String agreementJurisdiction = null;

  private String agreementValidFromToDate = null;

  private String agreementSignatoriesResponsibleParties = null;

  private String documentDirectoryEntryInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The contractual jurisdiction or coverage of the agreement (e.g. governed by State) 
   * @return agreementJurisdiction
  **/

  public String getAgreementJurisdiction() {
    return agreementJurisdiction;
  }

  public void setAgreementJurisdiction(String agreementJurisdiction) {
    this.agreementJurisdiction = agreementJurisdiction;
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


}

