package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsRetrieveInputModelRegulatoryTermsInstanceAnalysis
 */
public class BQRegulatoryTermsRetrieveInputModelRegulatoryTermsInstanceAnalysis   {
  private String regulatoryTermsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return regulatoryTermsInstanceAnalysisReference
  **/

  public String getRegulatoryTermsInstanceAnalysisReference() {
    return regulatoryTermsInstanceAnalysisReference;
  }

  public void setRegulatoryTermsInstanceAnalysisReference(String regulatoryTermsInstanceAnalysisReference) {
    this.regulatoryTermsInstanceAnalysisReference = regulatoryTermsInstanceAnalysisReference;
  }


}

