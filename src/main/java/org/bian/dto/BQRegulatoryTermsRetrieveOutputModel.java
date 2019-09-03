package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRegulatoryTermsRetrieveOutputModelCustomerAgreementInstanceRecord;
import org.bian.dto.BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceAnalysis;
import org.bian.dto.BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceRecord;
import org.bian.dto.BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsRetrieveOutputModel
 */
public class BQRegulatoryTermsRetrieveOutputModel   {
  private BQRegulatoryTermsRetrieveOutputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord = null;

  private BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord = null;

  private String regulatoryTermsRetrieveActionTaskReference = null;

  private Object regulatoryTermsRetrieveActionTaskRecord = null;

  private String regulatoryTermsRetrieveActionResponse = null;

  private BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceReport regulatoryTermsInstanceReport = null;

  private BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceAnalysis regulatoryTermsInstanceAnalysis = null;


  /**
   * Get customerAgreementInstanceRecord
   * @return customerAgreementInstanceRecord
  **/

  public BQRegulatoryTermsRetrieveOutputModelCustomerAgreementInstanceRecord getCustomerAgreementInstanceRecord() {
    return customerAgreementInstanceRecord;
  }

  public void setCustomerAgreementInstanceRecord(BQRegulatoryTermsRetrieveOutputModelCustomerAgreementInstanceRecord customerAgreementInstanceRecord) {
    this.customerAgreementInstanceRecord = customerAgreementInstanceRecord;
  }


  /**
   * Get regulatoryTermsInstanceRecord
   * @return regulatoryTermsInstanceRecord
  **/

  public BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceRecord getRegulatoryTermsInstanceRecord() {
    return regulatoryTermsInstanceRecord;
  }

  public void setRegulatoryTermsInstanceRecord(BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord) {
    this.regulatoryTermsInstanceRecord = regulatoryTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Regulatory Terms instance retrieve service call 
   * @return regulatoryTermsRetrieveActionTaskReference
  **/

  public String getRegulatoryTermsRetrieveActionTaskReference() {
    return regulatoryTermsRetrieveActionTaskReference;
  }

  public void setRegulatoryTermsRetrieveActionTaskReference(String regulatoryTermsRetrieveActionTaskReference) {
    this.regulatoryTermsRetrieveActionTaskReference = regulatoryTermsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return regulatoryTermsRetrieveActionTaskRecord
  **/

  public Object getRegulatoryTermsRetrieveActionTaskRecord() {
    return regulatoryTermsRetrieveActionTaskRecord;
  }

  public void setRegulatoryTermsRetrieveActionTaskRecord(Object regulatoryTermsRetrieveActionTaskRecord) {
    this.regulatoryTermsRetrieveActionTaskRecord = regulatoryTermsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return regulatoryTermsRetrieveActionResponse
  **/

  public String getRegulatoryTermsRetrieveActionResponse() {
    return regulatoryTermsRetrieveActionResponse;
  }

  public void setRegulatoryTermsRetrieveActionResponse(String regulatoryTermsRetrieveActionResponse) {
    this.regulatoryTermsRetrieveActionResponse = regulatoryTermsRetrieveActionResponse;
  }


  /**
   * Get regulatoryTermsInstanceReport
   * @return regulatoryTermsInstanceReport
  **/

  public BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceReport getRegulatoryTermsInstanceReport() {
    return regulatoryTermsInstanceReport;
  }

  public void setRegulatoryTermsInstanceReport(BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceReport regulatoryTermsInstanceReport) {
    this.regulatoryTermsInstanceReport = regulatoryTermsInstanceReport;
  }


  /**
   * Get regulatoryTermsInstanceAnalysis
   * @return regulatoryTermsInstanceAnalysis
  **/

  public BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceAnalysis getRegulatoryTermsInstanceAnalysis() {
    return regulatoryTermsInstanceAnalysis;
  }

  public void setRegulatoryTermsInstanceAnalysis(BQRegulatoryTermsRetrieveOutputModelRegulatoryTermsInstanceAnalysis regulatoryTermsInstanceAnalysis) {
    this.regulatoryTermsInstanceAnalysis = regulatoryTermsInstanceAnalysis;
  }


}

