package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLegalTermsRequestInputModelLegalTermsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLegalTermsRequestOutputModel
 */
public class BQLegalTermsRequestOutputModel   {
  private BQLegalTermsRequestInputModelLegalTermsInstanceRecord legalTermsInstanceRecord = null;

  private String legalTermsRequestActionTaskReference = null;

  private Object legalTermsRequestActionTaskRecord = null;

  private String legalTermsRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get legalTermsInstanceRecord
   * @return legalTermsInstanceRecord
  **/

  public BQLegalTermsRequestInputModelLegalTermsInstanceRecord getLegalTermsInstanceRecord() {
    return legalTermsInstanceRecord;
  }

  public void setLegalTermsInstanceRecord(BQLegalTermsRequestInputModelLegalTermsInstanceRecord legalTermsInstanceRecord) {
    this.legalTermsInstanceRecord = legalTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Legal Terms instance request service call 
   * @return legalTermsRequestActionTaskReference
  **/

  public String getLegalTermsRequestActionTaskReference() {
    return legalTermsRequestActionTaskReference;
  }

  public void setLegalTermsRequestActionTaskReference(String legalTermsRequestActionTaskReference) {
    this.legalTermsRequestActionTaskReference = legalTermsRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return legalTermsRequestActionTaskRecord
  **/

  public Object getLegalTermsRequestActionTaskRecord() {
    return legalTermsRequestActionTaskRecord;
  }

  public void setLegalTermsRequestActionTaskRecord(Object legalTermsRequestActionTaskRecord) {
    this.legalTermsRequestActionTaskRecord = legalTermsRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Legal Terms service request record 
   * @return legalTermsRequestRecordReference
  **/

  public String getLegalTermsRequestRecordReference() {
    return legalTermsRequestRecordReference;
  }

  public void setLegalTermsRequestRecordReference(String legalTermsRequestRecordReference) {
    this.legalTermsRequestRecordReference = legalTermsRequestRecordReference;
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

