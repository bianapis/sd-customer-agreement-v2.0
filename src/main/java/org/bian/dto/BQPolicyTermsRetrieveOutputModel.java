package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPolicyTermsRetrieveOutputModelCustomerAgreementInstanceRecord;
import org.bian.dto.BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceAnalysis;
import org.bian.dto.BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceRecord;
import org.bian.dto.BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPolicyTermsRetrieveOutputModel
 */
public class BQPolicyTermsRetrieveOutputModel   {
  private BQPolicyTermsRetrieveOutputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord = null;

  private BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceRecord policyTermsInstanceRecord = null;

  private String policyTermsRetrieveActionTaskReference = null;

  private Object policyTermsRetrieveActionTaskRecord = null;

  private String policyTermsRetrieveActionResponse = null;

  private BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceReport policyTermsInstanceReport = null;

  private BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceAnalysis policyTermsInstanceAnalysis = null;


  /**
   * Get customerAgreementInstanceRecord
   * @return customerAgreementInstanceRecord
  **/

  public BQPolicyTermsRetrieveOutputModelCustomerAgreementInstanceRecord getCustomerAgreementInstanceRecord() {
    return customerAgreementInstanceRecord;
  }

  public void setCustomerAgreementInstanceRecord(BQPolicyTermsRetrieveOutputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord) {
    this.customerAgreementInstanceRecord = customerAgreementInstanceRecord;
  }


  /**
   * Get policyTermsInstanceRecord
   * @return policyTermsInstanceRecord
  **/

  public BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceRecord getPolicyTermsInstanceRecord() {
    return policyTermsInstanceRecord;
  }

  public void setPolicyTermsInstanceRecord(BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceRecord policyTermsInstanceRecord) {
    this.policyTermsInstanceRecord = policyTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Policy Terms instance retrieve service call 
   * @return policyTermsRetrieveActionTaskReference
  **/

  public String getPolicyTermsRetrieveActionTaskReference() {
    return policyTermsRetrieveActionTaskReference;
  }

  public void setPolicyTermsRetrieveActionTaskReference(String policyTermsRetrieveActionTaskReference) {
    this.policyTermsRetrieveActionTaskReference = policyTermsRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return policyTermsRetrieveActionResponse
  **/

  public String getPolicyTermsRetrieveActionResponse() {
    return policyTermsRetrieveActionResponse;
  }

  public void setPolicyTermsRetrieveActionResponse(String policyTermsRetrieveActionResponse) {
    this.policyTermsRetrieveActionResponse = policyTermsRetrieveActionResponse;
  }


  /**
   * Get policyTermsInstanceReport
   * @return policyTermsInstanceReport
  **/

  public BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceReport getPolicyTermsInstanceReport() {
    return policyTermsInstanceReport;
  }

  public void setPolicyTermsInstanceReport(BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceReport policyTermsInstanceReport) {
    this.policyTermsInstanceReport = policyTermsInstanceReport;
  }


  /**
   * Get policyTermsInstanceAnalysis
   * @return policyTermsInstanceAnalysis
  **/

  public BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceAnalysis getPolicyTermsInstanceAnalysis() {
    return policyTermsInstanceAnalysis;
  }

  public void setPolicyTermsInstanceAnalysis(BQPolicyTermsRetrieveOutputModelPolicyTermsInstanceAnalysis policyTermsInstanceAnalysis) {
    this.policyTermsInstanceAnalysis = policyTermsInstanceAnalysis;
  }


}

