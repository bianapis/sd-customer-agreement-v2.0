package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerAgreementControlInputModelCustomerAgreementControlActionRequest
 */
public class CRCustomerAgreementControlInputModelCustomerAgreementControlActionRequest   {
  private String controlActionType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of processing action requested (e.g. suspend, skip, terminate) 
   * @return controlActionType
  **/

  public String getControlActionType() {
    return controlActionType;
  }

  public void setControlActionType(String controlActionType) {
    this.controlActionType = controlActionType;
  }


}

