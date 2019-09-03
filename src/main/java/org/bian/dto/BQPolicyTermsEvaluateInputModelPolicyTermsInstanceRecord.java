package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPolicyTermsEvaluateInputModelPolicyTermsInstanceRecord
 */
public class BQPolicyTermsEvaluateInputModelPolicyTermsInstanceRecord   {
  private String bankPolicyRuleType = null;

  private String applicableBankPolicyRuleReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of bank policy referenced (e.g. staff certification) 
   * @return bankPolicyRuleType
  **/

  public String getBankPolicyRuleType() {
    return bankPolicyRuleType;
  }

  public void setBankPolicyRuleType(String bankPolicyRuleType) {
    this.bankPolicyRuleType = bankPolicyRuleType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the bank's policies or rules 
   * @return applicableBankPolicyRuleReference
  **/

  public String getApplicableBankPolicyRuleReference() {
    return applicableBankPolicyRuleReference;
  }

  public void setApplicableBankPolicyRuleReference(String applicableBankPolicyRuleReference) {
    this.applicableBankPolicyRuleReference = applicableBankPolicyRuleReference;
  }


}

