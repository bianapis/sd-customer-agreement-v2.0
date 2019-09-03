package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsEvaluateOutputModelRegulatoryTermsInstanceRecord
 */
public class BQRegulatoryTermsEvaluateOutputModelRegulatoryTermsInstanceRecord   {
  private String applicableRegulationInterpretation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Explanation or interpretation of the regulation as applied 
   * @return applicableRegulationInterpretation
  **/

  public String getApplicableRegulationInterpretation() {
    return applicableRegulationInterpretation;
  }

  public void setApplicableRegulationInterpretation(String applicableRegulationInterpretation) {
    this.applicableRegulationInterpretation = applicableRegulationInterpretation;
  }


}

