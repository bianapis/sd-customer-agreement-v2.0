package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPolicyTermsRetrieveInputModelPolicyTermsInstanceAnalysis;
import org.bian.dto.BQPolicyTermsRetrieveInputModelPolicyTermsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPolicyTermsRetrieveInputModel
 */
public class BQPolicyTermsRetrieveInputModel   {
  private Object policyTermsRetrieveActionTaskRecord = null;

  private String policyTermsRetrieveActionRequest = null;

  private BQPolicyTermsRetrieveInputModelPolicyTermsInstanceReport policyTermsInstanceReport = null;

  private BQPolicyTermsRetrieveInputModelPolicyTermsInstanceAnalysis policyTermsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return policyTermsRetrieveActionTaskRecord
  **/

  public Object getPolicyTermsRetrieveActionTaskRecord() {
    return policyTermsRetrieveActionTaskRecord;
  }

  public void setPolicyTermsRetrieveActionTaskRecord(Object policyTermsRetrieveActionTaskRecord) {
    this.policyTermsRetrieveActionTaskRecord = policyTermsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return policyTermsRetrieveActionRequest
  **/

  public String getPolicyTermsRetrieveActionRequest() {
    return policyTermsRetrieveActionRequest;
  }

  public void setPolicyTermsRetrieveActionRequest(String policyTermsRetrieveActionRequest) {
    this.policyTermsRetrieveActionRequest = policyTermsRetrieveActionRequest;
  }


  /**
   * Get policyTermsInstanceReport
   * @return policyTermsInstanceReport
  **/

  public BQPolicyTermsRetrieveInputModelPolicyTermsInstanceReport getPolicyTermsInstanceReport() {
    return policyTermsInstanceReport;
  }

  public void setPolicyTermsInstanceReport(BQPolicyTermsRetrieveInputModelPolicyTermsInstanceReport policyTermsInstanceReport) {
    this.policyTermsInstanceReport = policyTermsInstanceReport;
  }


  /**
   * Get policyTermsInstanceAnalysis
   * @return policyTermsInstanceAnalysis
  **/

  public BQPolicyTermsRetrieveInputModelPolicyTermsInstanceAnalysis getPolicyTermsInstanceAnalysis() {
    return policyTermsInstanceAnalysis;
  }

  public void setPolicyTermsInstanceAnalysis(BQPolicyTermsRetrieveInputModelPolicyTermsInstanceAnalysis policyTermsInstanceAnalysis) {
    this.policyTermsInstanceAnalysis = policyTermsInstanceAnalysis;
  }


}

