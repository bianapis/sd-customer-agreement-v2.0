package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPolicyTermsRequestInputModelPolicyTermsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPolicyTermsRequestOutputModel
 */
public class BQPolicyTermsRequestOutputModel   {
  private BQPolicyTermsRequestInputModelPolicyTermsInstanceRecord policyTermsInstanceRecord = null;

  private String policyTermsRequestActionTaskReference = null;

  private Object policyTermsRequestActionTaskRecord = null;

  private String policyTermsRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get policyTermsInstanceRecord
   * @return policyTermsInstanceRecord
  **/

  public BQPolicyTermsRequestInputModelPolicyTermsInstanceRecord getPolicyTermsInstanceRecord() {
    return policyTermsInstanceRecord;
  }

  public void setPolicyTermsInstanceRecord(BQPolicyTermsRequestInputModelPolicyTermsInstanceRecord policyTermsInstanceRecord) {
    this.policyTermsInstanceRecord = policyTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Policy Terms instance request service call 
   * @return policyTermsRequestActionTaskReference
  **/

  public String getPolicyTermsRequestActionTaskReference() {
    return policyTermsRequestActionTaskReference;
  }

  public void setPolicyTermsRequestActionTaskReference(String policyTermsRequestActionTaskReference) {
    this.policyTermsRequestActionTaskReference = policyTermsRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return policyTermsRequestActionTaskRecord
  **/

  public Object getPolicyTermsRequestActionTaskRecord() {
    return policyTermsRequestActionTaskRecord;
  }

  public void setPolicyTermsRequestActionTaskRecord(Object policyTermsRequestActionTaskRecord) {
    this.policyTermsRequestActionTaskRecord = policyTermsRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Policy Terms service request record 
   * @return policyTermsRequestRecordReference
  **/

  public String getPolicyTermsRequestRecordReference() {
    return policyTermsRequestRecordReference;
  }

  public void setPolicyTermsRequestRecordReference(String policyTermsRequestRecordReference) {
    this.policyTermsRequestRecordReference = policyTermsRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

