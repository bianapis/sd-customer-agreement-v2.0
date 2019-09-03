package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLegalTermsUpdateInputModelLegalTermsInstanceRecord
 */
public class BQLegalTermsUpdateInputModelLegalTermsInstanceRecord   {
  private String jurisdiction = null;

  private String applicableLawReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The legal jurisdiction 
   * @return jurisdiction
  **/

  public String getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any legal requirements 
   * @return applicableLawReference
  **/

  public String getApplicableLawReference() {
    return applicableLawReference;
  }

  public void setApplicableLawReference(String applicableLawReference) {
    this.applicableLawReference = applicableLawReference;
  }


}

