package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRegulatoryTermsRequestInputModelRegulatoryTermsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsRequestOutputModel
 */
public class BQRegulatoryTermsRequestOutputModel   {
  private BQRegulatoryTermsRequestInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord = null;

  private String regulatoryTermsRequestActionTaskReference = null;

  private Object regulatoryTermsRequestActionTaskRecord = null;

  private String regulatoryTermsRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get regulatoryTermsInstanceRecord
   * @return regulatoryTermsInstanceRecord
  **/

  public BQRegulatoryTermsRequestInputModelRegulatoryTermsInstanceRecord getRegulatoryTermsInstanceRecord() {
    return regulatoryTermsInstanceRecord;
  }

  public void setRegulatoryTermsInstanceRecord(BQRegulatoryTermsRequestInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord) {
    this.regulatoryTermsInstanceRecord = regulatoryTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Regulatory Terms instance request service call 
   * @return regulatoryTermsRequestActionTaskReference
  **/

  public String getRegulatoryTermsRequestActionTaskReference() {
    return regulatoryTermsRequestActionTaskReference;
  }

  public void setRegulatoryTermsRequestActionTaskReference(String regulatoryTermsRequestActionTaskReference) {
    this.regulatoryTermsRequestActionTaskReference = regulatoryTermsRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return regulatoryTermsRequestActionTaskRecord
  **/

  public Object getRegulatoryTermsRequestActionTaskRecord() {
    return regulatoryTermsRequestActionTaskRecord;
  }

  public void setRegulatoryTermsRequestActionTaskRecord(Object regulatoryTermsRequestActionTaskRecord) {
    this.regulatoryTermsRequestActionTaskRecord = regulatoryTermsRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Regulatory Terms service request record 
   * @return regulatoryTermsRequestRecordReference
  **/

  public String getRegulatoryTermsRequestRecordReference() {
    return regulatoryTermsRequestRecordReference;
  }

  public void setRegulatoryTermsRequestRecordReference(String regulatoryTermsRequestRecordReference) {
    this.regulatoryTermsRequestRecordReference = regulatoryTermsRequestRecordReference;
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

