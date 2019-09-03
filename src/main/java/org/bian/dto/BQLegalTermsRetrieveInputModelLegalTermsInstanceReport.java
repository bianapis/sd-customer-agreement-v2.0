package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLegalTermsRetrieveInputModelLegalTermsInstanceReport
 */
public class BQLegalTermsRetrieveInputModelLegalTermsInstanceReport   {
  private String legalTermsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return legalTermsInstanceReportReference
  **/

  public String getLegalTermsInstanceReportReference() {
    return legalTermsInstanceReportReference;
  }

  public void setLegalTermsInstanceReportReference(String legalTermsInstanceReportReference) {
    this.legalTermsInstanceReportReference = legalTermsInstanceReportReference;
  }


}

