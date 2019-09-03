package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPolicyTermsEvaluateOutputModelPolicyTermsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPolicyTermsEvaluateOutputModel
 */
public class BQPolicyTermsEvaluateOutputModel   {
  private BQPolicyTermsEvaluateOutputModelPolicyTermsInstanceRecord policyTermsInstanceRecord = null;


  /**
   * Get policyTermsInstanceRecord
   * @return policyTermsInstanceRecord
  **/

  public BQPolicyTermsEvaluateOutputModelPolicyTermsInstanceRecord getPolicyTermsInstanceRecord() {
    return policyTermsInstanceRecord;
  }

  public void setPolicyTermsInstanceRecord(BQPolicyTermsEvaluateOutputModelPolicyTermsInstanceRecord policyTermsInstanceRecord) {
    this.policyTermsInstanceRecord = policyTermsInstanceRecord;
  }


}

