package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsRetrieveInputModelRegulatoryTermsInstanceReport
 */
public class BQRegulatoryTermsRetrieveInputModelRegulatoryTermsInstanceReport   {
  private String regulatoryTermsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return regulatoryTermsInstanceReportReference
  **/

  public String getRegulatoryTermsInstanceReportReference() {
    return regulatoryTermsInstanceReportReference;
  }

  public void setRegulatoryTermsInstanceReportReference(String regulatoryTermsInstanceReportReference) {
    this.regulatoryTermsInstanceReportReference = regulatoryTermsInstanceReportReference;
  }


}

