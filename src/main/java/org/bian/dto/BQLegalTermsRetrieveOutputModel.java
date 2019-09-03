package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLegalTermsRetrieveOutputModelCustomerAgreementInstanceRecord;
import org.bian.dto.BQLegalTermsRetrieveOutputModelLegalTermsInstanceAnalysis;
import org.bian.dto.BQLegalTermsRetrieveOutputModelLegalTermsInstanceRecord;
import org.bian.dto.BQLegalTermsRetrieveOutputModelLegalTermsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQLegalTermsRetrieveOutputModel
 */
public class BQLegalTermsRetrieveOutputModel   {
  private BQLegalTermsRetrieveOutputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord = null;

  private BQLegalTermsRetrieveOutputModelLegalTermsInstanceRecord legalTermsInstanceRecord = null;

  private String legalTermsRetrieveActionTaskReference = null;

  private Object legalTermsRetrieveActionTaskRecord = null;

  private String legalTermsRetrieveActionResponse = null;

  private BQLegalTermsRetrieveOutputModelLegalTermsInstanceReport legalTermsInstanceReport = null;

  private BQLegalTermsRetrieveOutputModelLegalTermsInstanceAnalysis legalTermsInstanceAnalysis = null;


  /**
   * Get customerAgreementInstanceRecord
   * @return customerAgreementInstanceRecord
  **/

  public BQLegalTermsRetrieveOutputModelCustomerAgreementInstanceRecord getCustomerAgreementInstanceRecord() {
    return customerAgreementInstanceRecord;
  }

  public void setCustomerAgreementInstanceRecord(BQLegalTermsRetrieveOutputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord) {
    this.customerAgreementInstanceRecord = customerAgreementInstanceRecord;
  }


  /**
   * Get legalTermsInstanceRecord
   * @return legalTermsInstanceRecord
  **/

  public BQLegalTermsRetrieveOutputModelLegalTermsInstanceRecord getLegalTermsInstanceRecord() {
    return legalTermsInstanceRecord;
  }

  public void setLegalTermsInstanceRecord(BQLegalTermsRetrieveOutputModelLegalTermsInstanceRecord legalTermsInstanceRecord) {
    this.legalTermsInstanceRecord = legalTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Legal Terms instance retrieve service call 
   * @return legalTermsRetrieveActionTaskReference
  **/

  public String getLegalTermsRetrieveActionTaskReference() {
    return legalTermsRetrieveActionTaskReference;
  }

  public void setLegalTermsRetrieveActionTaskReference(String legalTermsRetrieveActionTaskReference) {
    this.legalTermsRetrieveActionTaskReference = legalTermsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return legalTermsRetrieveActionTaskRecord
  **/

  public Object getLegalTermsRetrieveActionTaskRecord() {
    return legalTermsRetrieveActionTaskRecord;
  }

  public void setLegalTermsRetrieveActionTaskRecord(Object legalTermsRetrieveActionTaskRecord) {
    this.legalTermsRetrieveActionTaskRecord = legalTermsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return legalTermsRetrieveActionResponse
  **/

  public String getLegalTermsRetrieveActionResponse() {
    return legalTermsRetrieveActionResponse;
  }

  public void setLegalTermsRetrieveActionResponse(String legalTermsRetrieveActionResponse) {
    this.legalTermsRetrieveActionResponse = legalTermsRetrieveActionResponse;
  }


  /**
   * Get legalTermsInstanceReport
   * @return legalTermsInstanceReport
  **/

  public BQLegalTermsRetrieveOutputModelLegalTermsInstanceReport getLegalTermsInstanceReport() {
    return legalTermsInstanceReport;
  }

  public void setLegalTermsInstanceReport(BQLegalTermsRetrieveOutputModelLegalTermsInstanceReport legalTermsInstanceReport) {
    this.legalTermsInstanceReport = legalTermsInstanceReport;
  }


  /**
   * Get legalTermsInstanceAnalysis
   * @return legalTermsInstanceAnalysis
  **/

  public BQLegalTermsRetrieveOutputModelLegalTermsInstanceAnalysis getLegalTermsInstanceAnalysis() {
    return legalTermsInstanceAnalysis;
  }

  public void setLegalTermsInstanceAnalysis(BQLegalTermsRetrieveOutputModelLegalTermsInstanceAnalysis legalTermsInstanceAnalysis) {
    this.legalTermsInstanceAnalysis = legalTermsInstanceAnalysis;
  }


}

