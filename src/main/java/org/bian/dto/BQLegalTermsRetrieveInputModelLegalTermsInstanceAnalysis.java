package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLegalTermsRetrieveInputModelLegalTermsInstanceAnalysis
 */
public class BQLegalTermsRetrieveInputModelLegalTermsInstanceAnalysis   {
  private String legalTermsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return legalTermsInstanceAnalysisReference
  **/

  public String getLegalTermsInstanceAnalysisReference() {
    return legalTermsInstanceAnalysisReference;
  }

  public void setLegalTermsInstanceAnalysisReference(String legalTermsInstanceAnalysisReference) {
    this.legalTermsInstanceAnalysisReference = legalTermsInstanceAnalysisReference;
  }


}

