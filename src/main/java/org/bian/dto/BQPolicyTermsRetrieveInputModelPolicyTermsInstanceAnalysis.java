package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPolicyTermsRetrieveInputModelPolicyTermsInstanceAnalysis
 */
public class BQPolicyTermsRetrieveInputModelPolicyTermsInstanceAnalysis   {
  private String policyTermsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return policyTermsInstanceAnalysisReference
  **/

  public String getPolicyTermsInstanceAnalysisReference() {
    return policyTermsInstanceAnalysisReference;
  }

  public void setPolicyTermsInstanceAnalysisReference(String policyTermsInstanceAnalysisReference) {
    this.policyTermsInstanceAnalysisReference = policyTermsInstanceAnalysisReference;
  }


}

