package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsEvaluateInputModelRegulatoryTermsInstanceRecord
 */
public class BQRegulatoryTermsEvaluateInputModelRegulatoryTermsInstanceRecord   {
  private String regulatoryAuthority = null;

  private String applicableRegulationReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The applicable regulatory authority 
   * @return regulatoryAuthority
  **/

  public String getRegulatoryAuthority() {
    return regulatoryAuthority;
  }

  public void setRegulatoryAuthority(String regulatoryAuthority) {
    this.regulatoryAuthority = regulatoryAuthority;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any regulatory requirements 
   * @return applicableRegulationReference
  **/

  public String getApplicableRegulationReference() {
    return applicableRegulationReference;
  }

  public void setApplicableRegulationReference(String applicableRegulationReference) {
    this.applicableRegulationReference = applicableRegulationReference;
  }


}

